(ns com.google.cloud.compute.v1.stub.InstanceTemplateStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceTemplateStub]))

(defn ->instance-template-stub
  "Constructor."
  (^InstanceTemplateStub []
    (new InstanceTemplateStub )))

(defn get-iam-policy-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.getIamPolicyInstanceTemplateCallable))))

(defn get-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceTemplateHttpRequest,com.google.cloud.compute.v1.InstanceTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.getInstanceTemplateCallable))))

(defn delete-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.deleteInstanceTemplateCallable))))

(defn list-instance-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.listInstanceTemplatesPagedCallable))))

(defn test-iam-permissions-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.testIamPermissionsInstanceTemplateCallable))))

(defn close
  ""
  ([^InstanceTemplateStub this]
    (-> this (.close))))

(defn set-iam-policy-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.setIamPolicyInstanceTemplateCallable))))

(defn list-instance-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.listInstanceTemplatesCallable))))

(defn insert-instance-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateStub this]
    (-> this (.insertInstanceTemplateCallable))))

