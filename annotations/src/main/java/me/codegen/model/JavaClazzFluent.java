package me.codegen.model;

import me.builder.Fluent;
import me.builder.Nested;
import me.codegen.Method;

import java.util.LinkedHashSet;
import java.util.Set;

public class JavaClazzFluent<T extends JavaClazzFluent<T>> extends AttributeSupportFluent<T> implements Fluent<T> {


    private JavaType type ;
    
	public T withType(JavaType type) {
		this.type=type;
		return (T)this;
	}
	public JavaType getType() {
		return this.type;
	}

	public TypeNested<T> addType() {
		return new TypeNested<T>();
	}
    
	public class TypeNested<N> extends JavaTypeFluent<TypeNested<N>> implements Nested<N> {
		private final JavaTypeBuilder builder = new JavaTypeBuilder();
		public N endType() { return and(); }
		public N and() {
			return (N) withType(builder.build());
		}
        //Just add here anything else that needs to go inside the nested class.
	}


    private JavaMethod constructor ;
    
	public T withConstructor(JavaMethod constructor) {
		this.constructor=constructor;
		return (T)this;
	}
	public JavaMethod getConstructor() {
		return this.constructor;
	}

	public ConstructorNested<T> addConstructor() {
		return new ConstructorNested<T>();
	}
    
	public class ConstructorNested<N> extends JavaMethodFluent<ConstructorNested<N>> implements Nested<N> {
		private final JavaMethodBuilder builder = new JavaMethodBuilder();
		public N endConstructor() { return and(); }
		public N and() {
			return (N) withConstructor(builder.build());
		}
        //Just add here anything else that needs to go inside the nested class.
	}


    private Set<Method<JavaType,JavaProperty>> methods  = new LinkedHashSet();
    
	public T withMethods(Set methods) {
		this.methods=methods;
		return (T)this;
	}
	public T addToMethods(Method item) {
		this.methods.add(item);
		return (T)this;
	}
	public Set<Method<JavaType,JavaProperty>> getMethods() {
		return this.methods;
	}


    private Set<JavaProperty> fields  = new LinkedHashSet();
    
	public T withFields(Set fields) {
		this.fields=fields;
		return (T)this;
	}
	public T addToFields(JavaProperty item) {
		this.fields.add(item);
		return (T)this;
	}
	public Set<JavaProperty> getFields() {
		return this.fields;
	}


    private Set<JavaType> imports  = new LinkedHashSet();
    
	public T withImports(Set imports) {
		this.imports=imports;
		return (T)this;
	}
	public T addToImports(JavaType item) {
		this.imports.add(item);
		return (T)this;
	}
	public Set<JavaType> getImports() {
		return this.imports;
	}

}