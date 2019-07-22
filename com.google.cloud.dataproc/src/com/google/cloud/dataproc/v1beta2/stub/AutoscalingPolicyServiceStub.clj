(ns com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStub
  "Base stub class for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub AutoscalingPolicyServiceStub]))

(defn ->autoscaling-policy-service-stub
  "Constructor."
  (^AutoscalingPolicyServiceStub []
    (new AutoscalingPolicyServiceStub )))

(defn create-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceStub this]
    (-> this (.createAutoscalingPolicyCallable))))

(defn update-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceStub this]
    (-> this (.updateAutoscalingPolicyCallable))))

(defn get-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceStub this]
    (-> this (.getAutoscalingPolicyCallable))))

(defn list-autoscaling-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceStub this]
    (-> this (.listAutoscalingPoliciesPagedCallable))))

(defn list-autoscaling-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceStub this]
    (-> this (.listAutoscalingPoliciesCallable))))

(defn delete-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteAutoscalingPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceStub this]
    (-> this (.deleteAutoscalingPolicyCallable))))

(defn close
  ""
  ([^AutoscalingPolicyServiceStub this]
    (-> this (.close))))

