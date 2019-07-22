# Bindings for com.google.cloud.gaming

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.gaming "1.0.0"]
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

- class **com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesFixedSizeCollection**
- class **com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPage**
- class **com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse**
- class **com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient**
- class **com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings**
- class **com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersFixedSizeCollection**
- class **com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPage**
- class **com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse**
- class **com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient**
- class **com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings**
- class **com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsFixedSizeCollection**
- class **com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPage**
- class **com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse**
- class **com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient**
- class **com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceSettings**
- class **com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsFixedSizeCollection**
- class **com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPage**
- class **com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse**
- class **com.google.cloud.gaming.v1alpha.RealmsServiceClient**
- class **com.google.cloud.gaming.v1alpha.RealmsServiceSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.RealmsServiceSettings**
- class **com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesFixedSizeCollection**
- class **com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPage**
- class **com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse**
- class **com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient**
- class **com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceSettings**
- class **com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings**
- class **com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStubSettings**
- class **com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStubSettings**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcAllocationPoliciesServiceCallableFactory**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcAllocationPoliciesServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcGameServerClustersServiceCallableFactory**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcGameServerClustersServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcGameServerDeploymentsServiceCallableFactory**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcGameServerDeploymentsServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcRealmsServiceCallableFactory**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcRealmsServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcScalingPoliciesServiceCallableFactory**
- class **com.google.cloud.gaming.v1alpha.stub.GrpcScalingPoliciesServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.RealmsServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings**
- class **com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStub**
- class **com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder**
- class **com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
