(ns com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings$Builder
  "Builder for EntityTypesStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1.stub EntityTypesStubSettings$Builder]))

(defn create-entity-type-settings
  "Returns the builder for the settings used for calls to createEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.createEntityTypeSettings))))

(defn batch-delete-entities-settings
  "Returns the builder for the settings used for calls to batchDeleteEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.batchDeleteEntitiesSettings))))

(defn batch-update-entity-types-settings
  "Returns the builder for the settings used for calls to batchUpdateEntityTypes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.batchUpdateEntityTypesSettings))))

(defn batch-delete-entity-types-operation-settings
  "Returns the builder for the settings used for calls to batchDeleteEntityTypes.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStubSettings$Builder this]
    (-> this (.batchDeleteEntityTypesOperationSettings))))

(defn get-entity-type-settings
  "Returns the builder for the settings used for calls to getEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.getEntityTypeSettings))))

(defn batch-create-entities-settings
  "Returns the builder for the settings used for calls to batchCreateEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.batchCreateEntitiesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings$Builder [^EntityTypesStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn batch-delete-entities-operation-settings
  "Returns the builder for the settings used for calls to batchDeleteEntities.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStubSettings$Builder this]
    (-> this (.batchDeleteEntitiesOperationSettings))))

(defn batch-update-entities-settings
  "Returns the builder for the settings used for calls to batchUpdateEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.batchUpdateEntitiesSettings))))

(defn batch-update-entity-types-operation-settings
  "Returns the builder for the settings used for calls to batchUpdateEntityTypes.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse,com.google.protobuf.Struct>`"
  ([^EntityTypesStubSettings$Builder this]
    (-> this (.batchUpdateEntityTypesOperationSettings))))

(defn batch-update-entities-operation-settings
  "Returns the builder for the settings used for calls to batchUpdateEntities.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStubSettings$Builder this]
    (-> this (.batchUpdateEntitiesOperationSettings))))

(defn build
  "returns: `com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings [^EntityTypesStubSettings$Builder this]
    (-> this (.build))))

(defn update-entity-type-settings
  "Returns the builder for the settings used for calls to updateEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.updateEntityTypeSettings))))

(defn delete-entity-type-settings
  "Returns the builder for the settings used for calls to deleteEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.deleteEntityTypeSettings))))

(defn batch-delete-entity-types-settings
  "Returns the builder for the settings used for calls to batchDeleteEntityTypes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.batchDeleteEntityTypesSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^EntityTypesStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn batch-create-entities-operation-settings
  "Returns the builder for the settings used for calls to batchCreateEntities.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesStubSettings$Builder this]
    (-> this (.batchCreateEntitiesOperationSettings))))

(defn list-entity-types-settings
  "Returns the builder for the settings used for calls to listEntityTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse,com.google.cloud.dialogflow.v2beta1.EntityTypesClient$ListEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^EntityTypesStubSettings$Builder this]
    (-> this (.listEntityTypesSettings))))

