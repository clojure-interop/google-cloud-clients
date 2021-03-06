(ns com.google.cloud.dialogflow.v2.SessionEntityTypesSettings$Builder
  "Builder for SessionEntityTypesSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 SessionEntityTypesSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2.stub.SessionEntityTypesStubSettings$Builder [^SessionEntityTypesSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2.SessionEntityTypesSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2.SessionEntityTypesSettings$Builder [^SessionEntityTypesSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-session-entity-types-settings
  "Returns the builder for the settings used for calls to listSessionEntityTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2.ListSessionEntityTypesResponse,com.google.cloud.dialogflow.v2.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SessionEntityTypesSettings$Builder this]
    (-> this (.listSessionEntityTypesSettings))))

(defn get-session-entity-type-settings
  "Returns the builder for the settings used for calls to getSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.GetSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesSettings$Builder this]
    (-> this (.getSessionEntityTypeSettings))))

(defn create-session-entity-type-settings
  "Returns the builder for the settings used for calls to createSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.CreateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesSettings$Builder this]
    (-> this (.createSessionEntityTypeSettings))))

(defn update-session-entity-type-settings
  "Returns the builder for the settings used for calls to updateSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.UpdateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesSettings$Builder this]
    (-> this (.updateSessionEntityTypeSettings))))

(defn delete-session-entity-type-settings
  "Returns the builder for the settings used for calls to deleteSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesSettings$Builder this]
    (-> this (.deleteSessionEntityTypeSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2.SessionEntityTypesSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.SessionEntityTypesSettings [^SessionEntityTypesSettings$Builder this]
    (-> this (.build))))

