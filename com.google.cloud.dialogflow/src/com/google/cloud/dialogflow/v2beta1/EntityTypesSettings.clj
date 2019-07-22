(ns com.google.cloud.dialogflow.v2beta1.EntityTypesSettings
  "Settings class to configure an instance of EntityTypesClient.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getEntityType to 30 seconds:



  EntityTypesSettings.Builder entityTypesSettingsBuilder =
      EntityTypesSettings.newBuilder();
  entityTypesSettingsBuilder.getEntityTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  EntityTypesSettings entityTypesSettings = entityTypesSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 EntityTypesSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (EntityTypesSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (EntityTypesSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (EntityTypesSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.EntityTypesSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.EntityTypesSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (EntityTypesSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.EntityTypesSettings$Builder []
    (EntityTypesSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (EntityTypesSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.EntityTypesSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.EntityTypesSettings [^com.google.cloud.dialogflow.v2beta1.stub.EntityTypesStubSettings stub]
    (EntityTypesSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (EntityTypesSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (EntityTypesSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (EntityTypesSettings/getDefaultServiceScopes )))

(defn create-entity-type-settings
  "Returns the object with the settings used for calls to createEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.createEntityTypeSettings))))

(defn batch-delete-entities-settings
  "Returns the object with the settings used for calls to batchDeleteEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.batchDeleteEntitiesSettings))))

(defn batch-update-entity-types-settings
  "Returns the object with the settings used for calls to batchUpdateEntityTypes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.batchUpdateEntityTypesSettings))))

(defn batch-delete-entity-types-operation-settings
  "Returns the object with the settings used for calls to batchDeleteEntityTypes.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesSettings this]
    (-> this (.batchDeleteEntityTypesOperationSettings))))

(defn get-entity-type-settings
  "Returns the object with the settings used for calls to getEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.getEntityTypeSettings))))

(defn batch-create-entities-settings
  "Returns the object with the settings used for calls to batchCreateEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.batchCreateEntitiesSettings))))

(defn batch-delete-entities-operation-settings
  "Returns the object with the settings used for calls to batchDeleteEntities.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesSettings this]
    (-> this (.batchDeleteEntitiesOperationSettings))))

(defn batch-update-entities-settings
  "Returns the object with the settings used for calls to batchUpdateEntities.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.batchUpdateEntitiesSettings))))

(defn batch-update-entity-types-operation-settings
  "Returns the object with the settings used for calls to batchUpdateEntityTypes.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateEntityTypesResponse,com.google.protobuf.Struct>`"
  ([^EntityTypesSettings this]
    (-> this (.batchUpdateEntityTypesOperationSettings))))

(defn batch-update-entities-operation-settings
  "Returns the object with the settings used for calls to batchUpdateEntities.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.BatchUpdateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesSettings this]
    (-> this (.batchUpdateEntitiesOperationSettings))))

(defn update-entity-type-settings
  "Returns the object with the settings used for calls to updateEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.updateEntityTypeSettings))))

(defn delete-entity-type-settings
  "Returns the object with the settings used for calls to deleteEntityType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.deleteEntityTypeSettings))))

(defn batch-delete-entity-types-settings
  "Returns the object with the settings used for calls to batchDeleteEntityTypes.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.BatchDeleteEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EntityTypesSettings this]
    (-> this (.batchDeleteEntityTypesSettings))))

(defn batch-create-entities-operation-settings
  "Returns the object with the settings used for calls to batchCreateEntities.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.BatchCreateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesSettings this]
    (-> this (.batchCreateEntitiesOperationSettings))))

(defn list-entity-types-settings
  "Returns the object with the settings used for calls to listEntityTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.ListEntityTypesResponse,com.google.cloud.dialogflow.v2beta1.EntityTypesClient$ListEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^EntityTypesSettings this]
    (-> this (.listEntityTypesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.EntityTypesSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.EntityTypesSettings$Builder [^EntityTypesSettings this]
    (-> this (.toBuilder))))

