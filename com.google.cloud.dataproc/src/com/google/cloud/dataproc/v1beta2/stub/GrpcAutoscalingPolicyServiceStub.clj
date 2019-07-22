(ns com.google.cloud.dataproc.v1beta2.stub.GrpcAutoscalingPolicyServiceStub
  "gRPC stub implementation for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub GrpcAutoscalingPolicyServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dataproc.v1beta2.stub.GrpcAutoscalingPolicyServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.stub.GrpcAutoscalingPolicyServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcAutoscalingPolicyServiceStub/create client-context callable-factory))
  (^com.google.cloud.dataproc.v1beta2.stub.GrpcAutoscalingPolicyServiceStub [^com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStubSettings settings]
    (GrpcAutoscalingPolicyServiceStub/create settings)))

(defn update-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.updateAutoscalingPolicyCallable))))

(defn list-autoscaling-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.listAutoscalingPoliciesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcAutoscalingPolicyServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.shutdown))))

(defn create-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.createAutoscalingPolicyCallable))))

(defn get-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.getAutoscalingPolicyCallable))))

(defn close
  ""
  ([^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.isTerminated))))

(defn delete-autoscaling-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteAutoscalingPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.deleteAutoscalingPolicyCallable))))

(defn list-autoscaling-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.listAutoscalingPoliciesCallable))))

(defn shutdown-now
  ""
  ([^GrpcAutoscalingPolicyServiceStub this]
    (-> this (.shutdownNow))))

