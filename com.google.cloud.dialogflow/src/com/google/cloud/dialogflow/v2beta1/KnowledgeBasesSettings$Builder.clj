(ns com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder
  "Builder for KnowledgeBasesSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 KnowledgeBasesSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder [^KnowledgeBasesSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings$Builder [^KnowledgeBasesSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-knowledge-bases-settings
  "Returns the builder for the settings used for calls to listKnowledgeBases.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse,com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^KnowledgeBasesSettings$Builder this]
    (-> this (.listKnowledgeBasesSettings))))

(defn get-knowledge-base-settings
  "Returns the builder for the settings used for calls to getKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesSettings$Builder this]
    (-> this (.getKnowledgeBaseSettings))))

(defn create-knowledge-base-settings
  "Returns the builder for the settings used for calls to createKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesSettings$Builder this]
    (-> this (.createKnowledgeBaseSettings))))

(defn delete-knowledge-base-settings
  "Returns the builder for the settings used for calls to deleteKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesSettings$Builder this]
    (-> this (.deleteKnowledgeBaseSettings))))

(defn update-knowledge-base-settings
  "Returns the builder for the settings used for calls to updateKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesSettings$Builder this]
    (-> this (.updateKnowledgeBaseSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings [^KnowledgeBasesSettings$Builder this]
    (-> this (.build))))

