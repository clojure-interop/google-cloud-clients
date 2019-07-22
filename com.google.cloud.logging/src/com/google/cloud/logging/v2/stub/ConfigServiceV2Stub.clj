(ns com.google.cloud.logging.v2.stub.ConfigServiceV2Stub
  "Base stub class for Stackdriver Logging API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2.stub ConfigServiceV2Stub]))

(defn ->config-service-v-2-stub
  "Constructor."
  (^ConfigServiceV2Stub []
    (new ConfigServiceV2Stub )))

(defn update-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.updateSinkCallable))))

(defn list-exclusions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListExclusionsRequest,com.google.logging.v2.ListExclusionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.listExclusionsCallable))))

(defn delete-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteExclusionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.deleteExclusionCallable))))

(defn list-sinks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListSinksRequest,com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.listSinksPagedCallable))))

(defn create-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.createExclusionCallable))))

(defn get-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.getExclusionCallable))))

(defn close
  ""
  ([^ConfigServiceV2Stub this]
    (-> this (.close))))

(defn create-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.createSinkCallable))))

(defn get-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.getSinkCallable))))

(defn list-sinks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListSinksRequest,com.google.logging.v2.ListSinksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.listSinksCallable))))

(defn update-exclusion-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.updateExclusionCallable))))

(defn delete-sink-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteSinkRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.deleteSinkCallable))))

(defn list-exclusions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListExclusionsRequest,com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigServiceV2Stub this]
    (-> this (.listExclusionsPagedCallable))))

