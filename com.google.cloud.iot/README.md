# Bindings for com.google.cloud.iot

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.iot "1.0.0"]
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

- class **com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesFixedSizeCollection**
- class **com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPage**
- class **com.google.cloud.iot.v1.DeviceManagerClient$ListDeviceRegistriesPagedResponse**
- class **com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesFixedSizeCollection**
- class **com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPage**
- class **com.google.cloud.iot.v1.DeviceManagerClient$ListDevicesPagedResponse**
- class **com.google.cloud.iot.v1.DeviceManagerClient**
- class **com.google.cloud.iot.v1.DeviceManagerSettings$Builder**
- class **com.google.cloud.iot.v1.DeviceManagerSettings**
- class **com.google.cloud.iot.v1.stub.DeviceManagerStub**
- class **com.google.cloud.iot.v1.stub.DeviceManagerStubSettings$Builder**
- class **com.google.cloud.iot.v1.stub.DeviceManagerStubSettings**
- class **com.google.cloud.iot.v1.stub.GrpcDeviceManagerCallableFactory**
- class **com.google.cloud.iot.v1.stub.GrpcDeviceManagerStub**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
