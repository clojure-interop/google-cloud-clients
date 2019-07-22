(ns com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder
  "Builder for BigtableDataSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.stub EnhancedBigtableStubSettings$Builder]))

(defn get-project-id
  "Gets the project id of the target instance that was previously set on this Builder.

  returns: `java.lang.String`"
  (^java.lang.String [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.getProjectId))))

(defn mutate-row-settings
  "Returns the builder for the settings used for calls to MutateRow.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigtable.data.v2.models.RowMutation,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.mutateRowSettings))))

(defn bulk-mutate-rows-settings
  "Returns the builder for the settings used for calls to MutateTows.

  returns: `com.google.api.gax.rpc.BatchingCallSettings.Builder<com.google.cloud.bigtable.data.v2.models.RowMutation,java.lang.Void>`"
  (^com.google.api.gax.rpc.BatchingCallSettings.Builder [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.bulkMutateRowsSettings))))

(defn sample-row-keys-settings
  "Returns the builder for the settings used for calls to SampleRowKeysSettings.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<java.lang.String,java.util.List<com.google.cloud.bigtable.data.v2.models.KeyOffset>>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.sampleRowKeysSettings))))

(defn read-rows-settings
  "Returns the builder for the settings used for calls to readRows.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings.Builder<com.google.cloud.bigtable.data.v2.models.Query,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings.Builder [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.readRowsSettings))))

(defn check-and-mutate-row-settings
  "Returns the builder for the settings used for calls to CheckAndMutateRow.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation,java.lang.Boolean>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.checkAndMutateRowSettings))))

(defn get-app-profile-id
  "Gets the app profile id that was previously set on this Builder.

  returns: `java.lang.String`"
  (^java.lang.String [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.getAppProfileId))))

(defn set-project-id
  "Sets the project id of that target instance. This setting is required. All RPCs will be made
   in the context of this setting.

  project-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder [^EnhancedBigtableStubSettings$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn set-instance-id
  "Sets the target instance id. This setting is required. All RPCs will be made in the context
   of this setting.

  instance-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder [^EnhancedBigtableStubSettings$Builder this ^java.lang.String instance-id]
    (-> this (.setInstanceId instance-id))))

(defn build
  "returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.build))))

(defn read-modify-write-row-settings
  "Returns the builder with the settings used for calls to ReadModifyWriteRow.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.readModifyWriteRowSettings))))

(defn set-app-profile-id
  "Sets the AppProfile to use. An application profile (sometimes also shortened to \"app
   profile\") is a group of configuration parameters for an individual use case. A client will
   identify itself with an application profile ID at connection time, and the requests will be
   handled according to that application profile.

  app-profile-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder [^EnhancedBigtableStubSettings$Builder this ^java.lang.String app-profile-id]
    (-> this (.setAppProfileId app-profile-id))))

(defn get-instance-id
  "Gets the target instance id that was previously set on this Builder.

  returns: `java.lang.String`"
  (^java.lang.String [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.getInstanceId))))

(defn read-row-settings
  "Returns the builder for the settings used for point reads using readRow.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.bigtable.data.v2.models.Query,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EnhancedBigtableStubSettings$Builder this]
    (-> this (.readRowSettings))))

