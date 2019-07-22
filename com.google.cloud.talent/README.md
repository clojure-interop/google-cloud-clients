# Bindings for com.google.cloud.talent

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.talent "1.0.0"]
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

- class **com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPage**
- class **com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse**
- class **com.google.cloud.talent.v4beta1.ApplicationServiceClient**
- class **com.google.cloud.talent.v4beta1.ApplicationServiceSettings$Builder**
- class **com.google.cloud.talent.v4beta1.ApplicationServiceSettings**
- class **com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPage**
- class **com.google.cloud.talent.v4beta1.CompanyServiceClient$ListCompaniesPagedResponse**
- class **com.google.cloud.talent.v4beta1.CompanyServiceClient**
- class **com.google.cloud.talent.v4beta1.CompanyServiceSettings$Builder**
- class **com.google.cloud.talent.v4beta1.CompanyServiceSettings**
- class **com.google.cloud.talent.v4beta1.CompletionClient**
- class **com.google.cloud.talent.v4beta1.CompletionSettings$Builder**
- class **com.google.cloud.talent.v4beta1.CompletionSettings**
- class **com.google.cloud.talent.v4beta1.EventServiceClient**
- class **com.google.cloud.talent.v4beta1.EventServiceSettings$Builder**
- class **com.google.cloud.talent.v4beta1.EventServiceSettings**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPage**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPage**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPage**
- class **com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse**
- class **com.google.cloud.talent.v4beta1.JobServiceClient**
- class **com.google.cloud.talent.v4beta1.JobServiceSettings$Builder**
- class **com.google.cloud.talent.v4beta1.JobServiceSettings**
- class **com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPage**
- class **com.google.cloud.talent.v4beta1.ProfileServiceClient$ListProfilesPagedResponse**
- class **com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPage**
- class **com.google.cloud.talent.v4beta1.ProfileServiceClient$SearchProfilesPagedResponse**
- class **com.google.cloud.talent.v4beta1.ProfileServiceClient**
- class **com.google.cloud.talent.v4beta1.ProfileServiceSettings$Builder**
- class **com.google.cloud.talent.v4beta1.ProfileServiceSettings**
- class **com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsFixedSizeCollection**
- class **com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPage**
- class **com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse**
- class **com.google.cloud.talent.v4beta1.TenantServiceClient**
- class **com.google.cloud.talent.v4beta1.TenantServiceSettings$Builder**
- class **com.google.cloud.talent.v4beta1.TenantServiceSettings**
- class **com.google.cloud.talent.v4beta1.stub.ApplicationServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings$Builder**
- class **com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings**
- class **com.google.cloud.talent.v4beta1.stub.CompanyServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings$Builder**
- class **com.google.cloud.talent.v4beta1.stub.CompanyServiceStubSettings**
- class **com.google.cloud.talent.v4beta1.stub.CompletionStub**
- class **com.google.cloud.talent.v4beta1.stub.CompletionStubSettings$Builder**
- class **com.google.cloud.talent.v4beta1.stub.CompletionStubSettings**
- class **com.google.cloud.talent.v4beta1.stub.EventServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings$Builder**
- class **com.google.cloud.talent.v4beta1.stub.EventServiceStubSettings**
- class **com.google.cloud.talent.v4beta1.stub.GrpcApplicationServiceCallableFactory**
- class **com.google.cloud.talent.v4beta1.stub.GrpcApplicationServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.GrpcCompanyServiceCallableFactory**
- class **com.google.cloud.talent.v4beta1.stub.GrpcCompanyServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.GrpcCompletionCallableFactory**
- class **com.google.cloud.talent.v4beta1.stub.GrpcCompletionStub**
- class **com.google.cloud.talent.v4beta1.stub.GrpcEventServiceCallableFactory**
- class **com.google.cloud.talent.v4beta1.stub.GrpcEventServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.GrpcJobServiceCallableFactory**
- class **com.google.cloud.talent.v4beta1.stub.GrpcJobServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.GrpcProfileServiceCallableFactory**
- class **com.google.cloud.talent.v4beta1.stub.GrpcProfileServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.GrpcTenantServiceCallableFactory**
- class **com.google.cloud.talent.v4beta1.stub.GrpcTenantServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.JobServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings$Builder**
- class **com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings**
- class **com.google.cloud.talent.v4beta1.stub.ProfileServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings$Builder**
- class **com.google.cloud.talent.v4beta1.stub.ProfileServiceStubSettings**
- class **com.google.cloud.talent.v4beta1.stub.TenantServiceStub**
- class **com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder**
- class **com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
