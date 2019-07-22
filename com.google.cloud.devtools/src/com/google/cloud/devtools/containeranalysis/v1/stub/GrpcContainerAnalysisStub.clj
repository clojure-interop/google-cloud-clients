(ns com.google.cloud.devtools.containeranalysis.v1.stub.GrpcContainerAnalysisStub
  "gRPC stub implementation for Container Analysis API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1.stub GrpcContainerAnalysisStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.devtools.containeranalysis.v1.stub.GrpcContainerAnalysisStub`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1.stub.GrpcContainerAnalysisStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcContainerAnalysisStub/create client-context callable-factory))
  (^com.google.cloud.devtools.containeranalysis.v1.stub.GrpcContainerAnalysisStub [^com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings settings]
    (GrpcContainerAnalysisStub/create settings)))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisStub this]
    (-> this (.getIamPolicyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcContainerAnalysisStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcContainerAnalysisStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcContainerAnalysisStub this]
    (-> this (.shutdown))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcContainerAnalysisStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisStub this]
    (-> this (.testIamPermissionsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcContainerAnalysisStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcContainerAnalysisStub this]
    (-> this (.shutdownNow))))

