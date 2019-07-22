(ns com.google.cloud.logging.v2.ConfigSettings$Builder
  "Builder for ConfigSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 ConfigSettings$Builder]))

(defn create-sink-settings
  "Returns the builder for the settings used for calls to createSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.CreateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.createSinkSettings))))

(defn delete-exclusion-settings
  "Returns the builder for the settings used for calls to deleteExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.DeleteExclusionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.deleteExclusionSettings))))

(defn get-sink-settings
  "Returns the builder for the settings used for calls to getSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.GetSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.getSinkSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.logging.v2.ConfigSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.logging.v2.ConfigSettings$Builder [^ConfigSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-exclusion-settings
  "Returns the builder for the settings used for calls to updateExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.UpdateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.updateExclusionSettings))))

(defn build
  "returns: `com.google.cloud.logging.v2.ConfigSettings`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.ConfigSettings [^ConfigSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder`"
  (^com.google.cloud.logging.v2.stub.ConfigServiceV2StubSettings$Builder [^ConfigSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-sink-settings
  "Returns the builder for the settings used for calls to updateSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.UpdateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.updateSinkSettings))))

(defn create-exclusion-settings
  "Returns the builder for the settings used for calls to createExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.CreateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.createExclusionSettings))))

(defn list-sinks-settings
  "Returns the builder for the settings used for calls to listSinks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListSinksRequest,com.google.logging.v2.ListSinksResponse,com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.listSinksSettings))))

(defn get-exclusion-settings
  "Returns the builder for the settings used for calls to getExclusion.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.GetExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.getExclusionSettings))))

(defn list-exclusions-settings
  "Returns the builder for the settings used for calls to listExclusions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.logging.v2.ListExclusionsRequest,com.google.logging.v2.ListExclusionsResponse,com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.listExclusionsSettings))))

(defn delete-sink-settings
  "Returns the builder for the settings used for calls to deleteSink.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.logging.v2.DeleteSinkRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ConfigSettings$Builder this]
    (-> this (.deleteSinkSettings))))

