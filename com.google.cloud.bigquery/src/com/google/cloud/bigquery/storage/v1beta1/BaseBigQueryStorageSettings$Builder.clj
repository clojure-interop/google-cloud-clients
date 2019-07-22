(ns com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder
  "Builder for BaseBigQueryStorageSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1 BaseBigQueryStorageSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings$Builder`"
  (^com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings$Builder [^BaseBigQueryStorageSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder [^BaseBigQueryStorageSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-read-session-settings
  "Returns the builder for the settings used for calls to createReadSession.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BaseBigQueryStorageSettings$Builder this]
    (-> this (.createReadSessionSettings))))

(defn read-rows-settings
  "Returns the builder for the settings used for calls to readRows.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings.Builder<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings.Builder [^BaseBigQueryStorageSettings$Builder this]
    (-> this (.readRowsSettings))))

(defn batch-create-read-session-streams-settings
  "Returns the builder for the settings used for calls to batchCreateReadSessionStreams.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BaseBigQueryStorageSettings$Builder this]
    (-> this (.batchCreateReadSessionStreamsSettings))))

(defn finalize-stream-settings
  "Returns the builder for the settings used for calls to finalizeStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BaseBigQueryStorageSettings$Builder this]
    (-> this (.finalizeStreamSettings))))

(defn split-read-stream-settings
  "Returns the builder for the settings used for calls to splitReadStream.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BaseBigQueryStorageSettings$Builder this]
    (-> this (.splitReadStreamSettings))))

(defn build
  "returns: `com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings [^BaseBigQueryStorageSettings$Builder this]
    (-> this (.build))))

