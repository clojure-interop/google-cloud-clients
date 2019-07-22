(ns com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings$Builder
  "Builder for SessionEntityTypesStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub SessionEntityTypesStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings$Builder [^SessionEntityTypesStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SessionEntityTypesStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-session-entity-types-settings
  "Returns the builder for the settings used for calls to listSessionEntityTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse,com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SessionEntityTypesStubSettings$Builder this]
    (-> this (.listSessionEntityTypesSettings))))

(defn get-session-entity-type-settings
  "Returns the builder for the settings used for calls to getSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesStubSettings$Builder this]
    (-> this (.getSessionEntityTypeSettings))))

(defn create-session-entity-type-settings
  "Returns the builder for the settings used for calls to createSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesStubSettings$Builder this]
    (-> this (.createSessionEntityTypeSettings))))

(defn update-session-entity-type-settings
  "Returns the builder for the settings used for calls to updateSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesStubSettings$Builder this]
    (-> this (.updateSessionEntityTypeSettings))))

(defn delete-session-entity-type-settings
  "Returns the builder for the settings used for calls to deleteSessionEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SessionEntityTypesStubSettings$Builder this]
    (-> this (.deleteSessionEntityTypeSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStubSettings [^SessionEntityTypesStubSettings$Builder this]
    (-> this (.build))))

