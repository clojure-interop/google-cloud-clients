# Bindings for com.google.cloud.resourcemanager

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.resourcemanager "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.google.cloud.resourcemanager.Project$Builder**
- class **com.google.cloud.resourcemanager.Project**
- class **com.google.cloud.resourcemanager.ProjectInfo$Builder**
- class **com.google.cloud.resourcemanager.ProjectInfo$ResourceId**
- class **com.google.cloud.resourcemanager.ProjectInfo$State**
- class **com.google.cloud.resourcemanager.ProjectInfo**
- enum **com.google.cloud.resourcemanager.ResourceManager$ProjectField**
- class **com.google.cloud.resourcemanager.ResourceManager$ProjectGetOption**
- class **com.google.cloud.resourcemanager.ResourceManager$ProjectListOption**
- interface **com.google.cloud.resourcemanager.ResourceManager**
- class **com.google.cloud.resourcemanager.ResourceManagerException**
- interface **com.google.cloud.resourcemanager.ResourceManagerFactory**
- class **com.google.cloud.resourcemanager.ResourceManagerOptions$Builder**
- class **com.google.cloud.resourcemanager.ResourceManagerOptions$DefaultResourceManagerFactory**
- class **com.google.cloud.resourcemanager.ResourceManagerOptions$DefaultResourceManagerRpcFactory**
- class **com.google.cloud.resourcemanager.ResourceManagerOptions**
- interface **com.google.cloud.resourcemanager.spi.ResourceManagerRpcFactory**
- class **com.google.cloud.resourcemanager.spi.v1beta1.HttpResourceManagerRpc**
- enum **com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc$Option**
- interface **com.google.cloud.resourcemanager.spi.v1beta1.ResourceManagerRpc**
- class **com.google.cloud.resourcemanager.testing.LocalResourceManagerHelper**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
