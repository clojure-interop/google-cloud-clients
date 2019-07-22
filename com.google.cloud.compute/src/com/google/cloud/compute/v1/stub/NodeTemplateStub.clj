(ns com.google.cloud.compute.v1.stub.NodeTemplateStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NodeTemplateStub]))

(defn ->node-template-stub
  "Constructor."
  (^NodeTemplateStub []
    (new NodeTemplateStub )))

(defn list-node-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateClient$ListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.listNodeTemplatesPagedCallable))))

(defn aggregated-list-node-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateClient$AggregatedListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.aggregatedListNodeTemplatesPagedCallable))))

(defn test-iam-permissions-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNodeTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.testIamPermissionsNodeTemplateCallable))))

(defn get-iam-policy-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.getIamPolicyNodeTemplateCallable))))

(defn set-iam-policy-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.setIamPolicyNodeTemplateCallable))))

(defn list-node-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.listNodeTemplatesCallable))))

(defn close
  ""
  ([^NodeTemplateStub this]
    (-> this (.close))))

(defn delete-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.deleteNodeTemplateCallable))))

(defn get-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeTemplateHttpRequest,com.google.cloud.compute.v1.NodeTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.getNodeTemplateCallable))))

(defn aggregated-list-node-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.aggregatedListNodeTemplatesCallable))))

(defn insert-node-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateStub this]
    (-> this (.insertNodeTemplateCallable))))

