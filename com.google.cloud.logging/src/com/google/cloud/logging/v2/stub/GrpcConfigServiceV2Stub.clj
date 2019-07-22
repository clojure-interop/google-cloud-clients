(ns com.google.cloud.logging.v2.stub.GrpcConfigServiceV2Stub
  "gRPC stub implementation for Stackdriver Logging API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub GrpcConfigServiceV2Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.logging.v2.stub.GrpcConfigServiceV2Stub`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.stub.GrpcConfigServiceV2Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcConfigServiceV2Stub/create client-context callable-factory))
  (^com.google.cloud.logging.v2.stub.GrpcConfigServiceV2Stub [^com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings settings]
    (GrpcConfigServiceV2Stub/create settings)))

(defn update-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.updateSinkCallable))))

(defn list-exclusions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListExclusionsRequest,com.google.logging.v2.ListExclusionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.listExclusionsCallable))))

(defn delete-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteExclusionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.deleteExclusionCallable))))

(defn list-sinks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListSinksRequest,com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.listSinksPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcConfigServiceV2Stub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcConfigServiceV2Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcConfigServiceV2Stub this]
    (-> this (.shutdown))))

(defn create-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.createExclusionCallable))))

(defn get-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.getExclusionCallable))))

(defn close
  ""
  ([^GrpcConfigServiceV2Stub this]
    (-> this (.close))))

(defn create-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.createSinkCallable))))

(defn get-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.getSinkCallable))))

(defn list-sinks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListSinksRequest,com.google.logging.v2.ListSinksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.listSinksCallable))))

(defn update-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.updateExclusionCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcConfigServiceV2Stub this]
    (-> this (.isTerminated))))

(defn delete-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteSinkRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.deleteSinkCallable))))

(defn shutdown-now
  ""
  ([^GrpcConfigServiceV2Stub this]
    (-> this (.shutdownNow))))

(defn list-exclusions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListExclusionsRequest,com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcConfigServiceV2Stub this]
    (-> this (.listExclusionsPagedCallable))))

