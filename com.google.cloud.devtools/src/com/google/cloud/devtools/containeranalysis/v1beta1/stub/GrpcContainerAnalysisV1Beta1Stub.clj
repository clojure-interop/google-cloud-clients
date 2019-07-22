(ns com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcContainerAnalysisV1Beta1Stub
  "gRPC stub implementation for Container Analysis API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1.stub GrpcContainerAnalysisV1Beta1Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcContainerAnalysisV1Beta1Stub`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcContainerAnalysisV1Beta1Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcContainerAnalysisV1Beta1Stub/create client-context callable-factory))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcContainerAnalysisV1Beta1Stub [^com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1StubSettings settings]
    (GrpcContainerAnalysisV1Beta1Stub/create settings)))

(defn get-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.GetScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.getScanConfigCallable))))

(defn update-scan-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.UpdateScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.updateScanConfigCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.getIamPolicyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.isShutdown))))

(defn list-scan-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.containeranalysis.v1beta1.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.listScanConfigsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcContainerAnalysisV1Beta1Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.shutdown))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.testIamPermissionsCallable))))

(defn list-scan-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.listScanConfigsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcContainerAnalysisV1Beta1Stub this]
    (-> this (.shutdownNow))))

