(ns com.google.cloud.webrisk.v1beta1.stub.GrpcWebRiskServiceV1Beta1Stub
  "gRPC stub implementation for Web Risk API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.webrisk.v1beta1.stub GrpcWebRiskServiceV1Beta1Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.webrisk.v1beta1.stub.GrpcWebRiskServiceV1Beta1Stub`

  throws: java.io.IOException"
  (^com.google.cloud.webrisk.v1beta1.stub.GrpcWebRiskServiceV1Beta1Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcWebRiskServiceV1Beta1Stub/create client-context callable-factory))
  (^com.google.cloud.webrisk.v1beta1.stub.GrpcWebRiskServiceV1Beta1Stub [^com.google.cloud.webrisk.v1beta1.stub.WebRiskServiceV1Beta1StubSettings settings]
    (GrpcWebRiskServiceV1Beta1Stub/create settings)))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcWebRiskServiceV1Beta1Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.shutdown))))

(defn compute-threat-list-diff-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.ComputeThreatListDiffRequest,com.google.webrisk.v1beta1.ComputeThreatListDiffResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.computeThreatListDiffCallable))))

(defn search-hashes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.SearchHashesRequest,com.google.webrisk.v1beta1.SearchHashesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.searchHashesCallable))))

(defn close
  ""
  ([^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.isTerminated))))

(defn search-uris-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.webrisk.v1beta1.SearchUrisRequest,com.google.webrisk.v1beta1.SearchUrisResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.searchUrisCallable))))

(defn shutdown-now
  ""
  ([^GrpcWebRiskServiceV1Beta1Stub this]
    (-> this (.shutdownNow))))

