(ns com.google.cloud.monitoring.v3.stub.GrpcAlertPolicyServiceStub
  "gRPC stub implementation for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub GrpcAlertPolicyServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.monitoring.v3.stub.GrpcAlertPolicyServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.stub.GrpcAlertPolicyServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcAlertPolicyServiceStub/create client-context callable-factory))
  (^com.google.cloud.monitoring.v3.stub.GrpcAlertPolicyServiceStub [^com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings settings]
    (GrpcAlertPolicyServiceStub/create settings)))

(defn get-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAlertPolicyServiceStub this]
    (-> this (.getAlertPolicyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcAlertPolicyServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcAlertPolicyServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcAlertPolicyServiceStub this]
    (-> this (.shutdown))))

(defn update-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAlertPolicyServiceStub this]
    (-> this (.updateAlertPolicyCallable))))

(defn list-alert-policies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAlertPolicyServiceStub this]
    (-> this (.listAlertPoliciesPagedCallable))))

(defn delete-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteAlertPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAlertPolicyServiceStub this]
    (-> this (.deleteAlertPolicyCallable))))

(defn close
  ""
  ([^GrpcAlertPolicyServiceStub this]
    (-> this (.close))))

(defn list-alert-policies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.monitoring.v3.ListAlertPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAlertPolicyServiceStub this]
    (-> this (.listAlertPoliciesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcAlertPolicyServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcAlertPolicyServiceStub this]
    (-> this (.shutdownNow))))

(defn create-alert-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAlertPolicyServiceStub this]
    (-> this (.createAlertPolicyCallable))))

