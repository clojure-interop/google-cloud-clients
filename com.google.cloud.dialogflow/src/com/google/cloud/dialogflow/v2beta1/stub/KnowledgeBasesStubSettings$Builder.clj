(ns com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder
  "Builder for KnowledgeBasesStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub KnowledgeBasesStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings$Builder [^KnowledgeBasesStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^KnowledgeBasesStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-knowledge-bases-settings
  "Returns the builder for the settings used for calls to listKnowledgeBases.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse,com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^KnowledgeBasesStubSettings$Builder this]
    (-> this (.listKnowledgeBasesSettings))))

(defn get-knowledge-base-settings
  "Returns the builder for the settings used for calls to getKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesStubSettings$Builder this]
    (-> this (.getKnowledgeBaseSettings))))

(defn create-knowledge-base-settings
  "Returns the builder for the settings used for calls to createKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesStubSettings$Builder this]
    (-> this (.createKnowledgeBaseSettings))))

(defn delete-knowledge-base-settings
  "Returns the builder for the settings used for calls to deleteKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesStubSettings$Builder this]
    (-> this (.deleteKnowledgeBaseSettings))))

(defn update-knowledge-base-settings
  "Returns the builder for the settings used for calls to updateKnowledgeBase.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^KnowledgeBasesStubSettings$Builder this]
    (-> this (.updateKnowledgeBaseSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStubSettings [^KnowledgeBasesStubSettings$Builder this]
    (-> this (.build))))

