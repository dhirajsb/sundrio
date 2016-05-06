/*
 * Copyright 2016 The original authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.sundr.codegen.model;

import io.sundr.builder.Editable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EditableTypeDef extends TypeDef implements Editable<TypeDefBuilder>{


public EditableTypeDef( Kind kind , String packageName , String name , Set<ClassRef> annotations , Set<ClassRef> extendsList , Set<ClassRef> implementsList , List<TypeParamDef> parameters , Set<Property> properties , Set<Method> constructors , Set<Method> methods , int modifiers , Map<String, Object> attributes ){
    super(kind, packageName, name, annotations, extendsList, implementsList, parameters, properties, constructors, methods, modifiers, attributes);
}

public TypeDefBuilder edit(){
    return new TypeDefBuilder(this);
}


}
    
