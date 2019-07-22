(ns com.google.cloud.compute.v1.stub.HttpJsonNodeTemplateStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonNodeTemplateStub]))

(def *-aggregated-list-node-templates-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateAggregatedList>"
  HttpJsonNodeTemplateStub/aggregatedListNodeTemplatesMethodDescriptor)

(def *-delete-node-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNodeTemplateStub/deleteNodeTemplateMethodDescriptor)

(def *-get-node-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetNodeTemplateHttpRequest,com.google.cloud.compute.v1.NodeTemplate>"
  HttpJsonNodeTemplateStub/getNodeTemplateMethodDescriptor)

(def *-get-iam-policy-node-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonNodeTemplateStub/getIamPolicyNodeTemplateMethodDescriptor)

(def *-insert-node-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNodeTemplateStub/insertNodeTemplateMethodDescriptor)

(def *-list-node-templates-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateList>"
  HttpJsonNodeTemplateStub/listNodeTemplatesMethodDescriptor)

(def *-set-iam-policy-node-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonNodeTemplateStub/setIamPolicyNodeTemplateMethodDescriptor)

(def *-test-iam-permissions-node-template-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsNodeTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonNodeTemplateStub/testIamPermissionsNodeTemplateMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonNodeTemplateStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonNodeTemplateStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonNodeTemplateStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonNodeTemplateStub [^com.google.cloud.compute.v1.stub.NodeTemplateStubSettings settings]
    (HttpJsonNodeTemplateStub/create settings)))

(defn list-node-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateClient$ListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.listNodeTemplatesPagedCallable))))

(defn aggregated-list-node-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateClient$AggregatedListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.aggregatedListNodeTemplatesPagedCallable))))

(defn test-iam-permissions-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNodeTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.testIamPermissionsNodeTemplateCallable))))

(defn get-iam-policy-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.getIamPolicyNodeTemplateCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNodeTemplateStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonNodeTemplateStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonNodeTemplateStub this]
    (-> this (.shutdown))))

(defn set-iam-policy-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.setIamPolicyNodeTemplateCallable))))

(defn list-node-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.listNodeTemplatesCallable))))

(defn close
  ""
  ([^HttpJsonNodeTemplateStub this]
    (-> this (.close))))

(defn delete-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.deleteNodeTemplateCallable))))

(defn get-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeTemplateHttpRequest,com.google.cloud.compute.v1.NodeTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.getNodeTemplateCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNodeTemplateStub this]
    (-> this (.isTerminated))))

(defn aggregated-list-node-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.aggregatedListNodeTemplatesCallable))))

(defn insert-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTemplateStub this]
    (-> this (.insertNodeTemplateCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonNodeTemplateStub this]
    (-> this (.shutdownNow))))

