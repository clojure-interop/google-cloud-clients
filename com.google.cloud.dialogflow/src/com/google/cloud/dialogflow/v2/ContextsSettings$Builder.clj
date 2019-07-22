(ns com.google.cloud.dialogflow.v2.ContextsSettings$Builder
  "Builder for ContextsSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 ContextsSettings$Builder]))

(defn delete-all-contexts-settings
  "Returns the builder for the settings used for calls to deleteAllContexts.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.DeleteAllContextsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContextsSettings$Builder this]
    (-> this (.deleteAllContextsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2.ContextsSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2.ContextsSettings$Builder [^ContextsSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-context-settings
  "Returns the builder for the settings used for calls to updateContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.UpdateContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContextsSettings$Builder this]
    (-> this (.updateContextSettings))))

(defn delete-context-settings
  "Returns the builder for the settings used for calls to deleteContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.DeleteContextRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContextsSettings$Builder this]
    (-> this (.deleteContextSettings))))

(defn create-context-settings
  "Returns the builder for the settings used for calls to createContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.CreateContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContextsSettings$Builder this]
    (-> this (.createContextSettings))))

(defn get-context-settings
  "Returns the builder for the settings used for calls to getContext.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2.GetContextRequest,com.google.cloud.dialogflow.v2.Context>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContextsSettings$Builder this]
    (-> this (.getContextSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2.ContextsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.ContextsSettings [^ContextsSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.dialogflow.v2.stub.ContextsStubSettings$Builder`"
  (^com.google.cloud.dialogflow.v2.stub.ContextsStubSettings$Builder [^ContextsSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn list-contexts-settings
  "Returns the builder for the settings used for calls to listContexts.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2.ListContextsRequest,com.google.cloud.dialogflow.v2.ListContextsResponse,com.google.cloud.dialogflow.v2.ContextsClient$ListContextsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ContextsSettings$Builder this]
    (-> this (.listContextsSettings))))

