# Bindings for com.google.cloud.dataproc

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.dataproc "1.0.0"]
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

- class **com.google.cloud.dataproc.v1.ClusterControllerClient$ListClustersFixedSizeCollection**
- class **com.google.cloud.dataproc.v1.ClusterControllerClient$ListClustersPage**
- class **com.google.cloud.dataproc.v1.ClusterControllerClient$ListClustersPagedResponse**
- class **com.google.cloud.dataproc.v1.ClusterControllerClient**
- class **com.google.cloud.dataproc.v1.ClusterControllerSettings$Builder**
- class **com.google.cloud.dataproc.v1.ClusterControllerSettings**
- class **com.google.cloud.dataproc.v1.JobControllerClient$ListJobsFixedSizeCollection**
- class **com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPage**
- class **com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse**
- class **com.google.cloud.dataproc.v1.JobControllerClient**
- class **com.google.cloud.dataproc.v1.JobControllerSettings$Builder**
- class **com.google.cloud.dataproc.v1.JobControllerSettings**
- class **com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesFixedSizeCollection**
- class **com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPage**
- class **com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse**
- class **com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient**
- class **com.google.cloud.dataproc.v1.WorkflowTemplateServiceSettings$Builder**
- class **com.google.cloud.dataproc.v1.WorkflowTemplateServiceSettings**
- class **com.google.cloud.dataproc.v1.stub.ClusterControllerStub**
- class **com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings$Builder**
- class **com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings**
- class **com.google.cloud.dataproc.v1.stub.GrpcClusterControllerCallableFactory**
- class **com.google.cloud.dataproc.v1.stub.GrpcClusterControllerStub**
- class **com.google.cloud.dataproc.v1.stub.GrpcJobControllerCallableFactory**
- class **com.google.cloud.dataproc.v1.stub.GrpcJobControllerStub**
- class **com.google.cloud.dataproc.v1.stub.GrpcWorkflowTemplateServiceCallableFactory**
- class **com.google.cloud.dataproc.v1.stub.GrpcWorkflowTemplateServiceStub**
- class **com.google.cloud.dataproc.v1.stub.JobControllerStub**
- class **com.google.cloud.dataproc.v1.stub.JobControllerStubSettings$Builder**
- class **com.google.cloud.dataproc.v1.stub.JobControllerStubSettings**
- class **com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStub**
- class **com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings$Builder**
- class **com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings**
- class **com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesFixedSizeCollection**
- class **com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPage**
- class **com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse**
- class **com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient**
- class **com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings**
- class **com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersFixedSizeCollection**
- class **com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPage**
- class **com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPagedResponse**
- class **com.google.cloud.dataproc.v1beta2.ClusterControllerClient**
- class **com.google.cloud.dataproc.v1beta2.ClusterControllerSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.ClusterControllerSettings**
- class **com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsFixedSizeCollection**
- class **com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPage**
- class **com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPagedResponse**
- class **com.google.cloud.dataproc.v1beta2.JobControllerClient**
- class **com.google.cloud.dataproc.v1beta2.JobControllerSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.JobControllerSettings**
- class **com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesFixedSizeCollection**
- class **com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesPage**
- class **com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse**
- class **com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient**
- class **com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings**
- class **com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStub**
- class **com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStubSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStubSettings**
- class **com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStub**
- class **com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStubSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.stub.ClusterControllerStubSettings**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcAutoscalingPolicyServiceCallableFactory**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcAutoscalingPolicyServiceStub**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcClusterControllerCallableFactory**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcClusterControllerStub**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcJobControllerCallableFactory**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcJobControllerStub**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcWorkflowTemplateServiceCallableFactory**
- class **com.google.cloud.dataproc.v1beta2.stub.GrpcWorkflowTemplateServiceStub**
- class **com.google.cloud.dataproc.v1beta2.stub.JobControllerStub**
- class **com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.stub.JobControllerStubSettings**
- class **com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStub**
- class **com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStubSettings$Builder**
- class **com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
