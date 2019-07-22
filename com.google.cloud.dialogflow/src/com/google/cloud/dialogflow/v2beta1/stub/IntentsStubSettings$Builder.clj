(ns com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings$Builder
  "Builder for IntentsStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub IntentsStubSettings$Builder]))

(defn get-intent-settings
  "Returns the builder for the settings used for calls to getIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.GetIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IntentsStubSettings$Builder this]
    (-> this (.getIntentSettings))))

(defn delete-intent-settings
  "Returns the builder for the settings used for calls to deleteIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IntentsStubSettings$Builder this]
    (-> this (.deleteIntentSettings))))

(defn batch-delete-intents-settings
  "Returns the builder for the settings used for calls to batchDeleteIntents.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IntentsStubSettings$Builder this]
    (-> this (.batchDeleteIntentsSettings))))

(defn list-intents-settings
  "Returns the builder for the settings used for calls to listIntents.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,com.google.cloud.dialogflow.v2beta1.ListIntentsResponse,com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^IntentsStubSettings$Builder this]
    (-> this (.listIntentsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings$Builder [^IntentsStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn batch-update-intents-settings
  "Returns the builder for the settings used for calls to batchUpdateIntents.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IntentsStubSettings$Builder this]
    (-> this (.batchUpdateIntentsSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings [^IntentsStubSettings$Builder this]
    (-> this (.build))))

(defn create-intent-settings
  "Returns the builder for the settings used for calls to createIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.CreateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IntentsStubSettings$Builder this]
    (-> this (.createIntentSettings))))

(defn batch-update-intents-operation-settings
  "Returns the builder for the settings used for calls to batchUpdateIntents.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse,com.google.protobuf.Struct>`"
  ([^IntentsStubSettings$Builder this]
    (-> this (.batchUpdateIntentsOperationSettings))))

(defn batch-delete-intents-operation-settings
  "Returns the builder for the settings used for calls to batchDeleteIntents.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^IntentsStubSettings$Builder this]
    (-> this (.batchDeleteIntentsOperationSettings))))

(defn update-intent-settings
  "Returns the builder for the settings used for calls to updateIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^IntentsStubSettings$Builder this]
    (-> this (.updateIntentSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^IntentsStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

