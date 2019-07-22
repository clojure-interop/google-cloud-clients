(ns com.google.cloud.compute.v1.stub.HttpJsonInstanceTemplateStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonInstanceTemplateStub]))

(def *-delete-instance-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceTemplateStub/deleteInstanceTemplateMethodDescriptor)

(def *-get-instance-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetInstanceTemplateHttpRequest,com.google.cloud.compute.v1.InstanceTemplate>"
  HttpJsonInstanceTemplateStub/getInstanceTemplateMethodDescriptor)

(def *-get-iam-policy-instance-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonInstanceTemplateStub/getIamPolicyInstanceTemplateMethodDescriptor)

(def *-insert-instance-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInstanceTemplateStub/insertInstanceTemplateMethodDescriptor)

(def *-list-instance-templates-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateList>"
  HttpJsonInstanceTemplateStub/listInstanceTemplatesMethodDescriptor)

(def *-set-iam-policy-instance-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonInstanceTemplateStub/setIamPolicyInstanceTemplateMethodDescriptor)

(def *-test-iam-permissions-instance-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonInstanceTemplateStub/testIamPermissionsInstanceTemplateMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonInstanceTemplateStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceTemplateStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonInstanceTemplateStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonInstanceTemplateStub [^com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings settings]
    (HttpJsonInstanceTemplateStub/create settings)))

(defn get-iam-policy-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.getIamPolicyInstanceTemplateCallable))))

(defn get-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceTemplateHttpRequest,com.google.cloud.compute.v1.InstanceTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.getInstanceTemplateCallable))))

(defn delete-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.deleteInstanceTemplateCallable))))

(defn list-instance-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.listInstanceTemplatesPagedCallable))))

(defn test-iam-permissions-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.testIamPermissionsInstanceTemplateCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceTemplateStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonInstanceTemplateStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonInstanceTemplateStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonInstanceTemplateStub this]
    (-> this (.close))))

(defn set-iam-policy-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.setIamPolicyInstanceTemplateCallable))))

(defn list-instance-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.listInstanceTemplatesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInstanceTemplateStub this]
    (-> this (.isTerminated))))

(defn insert-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInstanceTemplateStub this]
    (-> this (.insertInstanceTemplateCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonInstanceTemplateStub this]
    (-> this (.shutdownNow))))

