(ns com.google.cloud.dialogflow.v2.EntityTypesClient
  "Service Description: Entities are extracted from user input and represent parameters that are
  meaningful to your application. For example, a date range, a proper name such as a geographic
  location or landmark, and so on. Entities represent actionable data for your application.

  When you define an entity, you can also include synonyms that all map to that entity. For
  example, \"soft drink\", \"soda\", \"pop\", and so on.

  There are three types of entities:

  * **System** - entities that are defined by the Dialogflow API for common
  data types such as date, time, currency, and so on. A system entity is represented by the
  `EntityType` type.

  * **Developer** - entities that are defined by you that represent
  actionable data that is meaningful to your application. For example, you could define a
  `pizza.sauce` entity for red or white pizza sauce, a `pizza.cheese` entity for the different
  types of cheese on a pizza, a `pizza.topping` entity for different toppings, and so on. A
  developer entity is represented by the `EntityType` type.

  * **User** - entities that are built for an individual user such as
  favorites, preferences, playlists, and so on. A user entity is represented by the
  [SessionEntityType][google.cloud.dialogflow.v2.SessionEntityType] type.

  For more information about entity types, see the [Dialogflow
  documentation](https://cloud.google.com/dialogflow/docs/entities-overview).

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
    EntityTypeName name = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
    EntityType response = entityTypesClient.getEntityType(name);
  }

  Note: close() needs to be called on the entityTypesClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of EntityTypesSettings to
  create(). For example:

  To customize credentials:



  EntityTypesSettings entityTypesSettings =
      EntityTypesSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  EntityTypesClient entityTypesClient =
      EntityTypesClient.create(entityTypesSettings);

  To customize the endpoint:



  EntityTypesSettings entityTypesSettings =
      EntityTypesSettings.newBuilder().setEndpoint(myEndpoint).build();
  EntityTypesClient entityTypesClient =
      EntityTypesClient.create(entityTypesSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 EntityTypesClient]))

(defn *create
  "Constructs an instance of EntityTypesClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2.EntityTypesSettings`

  returns: `com.google.cloud.dialogflow.v2.EntityTypesClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.EntityTypesClient [^com.google.cloud.dialogflow.v2.EntityTypesSettings settings]
    (EntityTypesClient/create settings))
  (^com.google.cloud.dialogflow.v2.EntityTypesClient []
    (EntityTypesClient/create )))

(defn update-entity-type
  "Updates the specified entity type.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityType entityType = EntityType.newBuilder().build();
     String languageCode = \"\";
     EntityType response = entityTypesClient.updateEntityType(entityType, languageCode);
   }

  entity-type - Required. The entity type to update. - `com.google.cloud.dialogflow.v2.EntityType`
  language-code - Optional. The language of entity synonyms defined in `entity_type`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `com.google.cloud.dialogflow.v2.EntityType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.EntityType [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityType entity-type ^java.lang.String language-code]
    (-> this (.updateEntityType entity-type language-code)))
  (^com.google.cloud.dialogflow.v2.EntityType [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityType entity-type]
    (-> this (.updateEntityType entity-type))))

(defn batch-create-entities-callable
  "Creates multiple new entities in the specified entity type.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<EntityType.Entity> entities = new ArrayList<>();
     BatchCreateEntitiesRequest request = BatchCreateEntitiesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntities(entities)
       .build();
     ApiFuture<Operation> future = entityTypesClient.batchCreateEntitiesCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.BatchCreateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.batchCreateEntitiesCallable))))

(defn batch-update-entity-types-async
  "Updates/Creates multiple entity types in the specified agent.

   Operation <response:
   [BatchUpdateEntityTypesResponse][google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     BatchUpdateEntityTypesRequest request = BatchUpdateEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     BatchUpdateEntityTypesResponse response = entityTypesClient.batchUpdateEntityTypesAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest request]
    (-> this (.batchUpdateEntityTypesAsync request))))

(defn batch-update-entities-callable
  "Updates or creates multiple entities in the specified entity type. This method does not affect
   entities in the entity type that aren't explicitly specified in the request.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<EntityType.Entity> entities = new ArrayList<>();
     BatchUpdateEntitiesRequest request = BatchUpdateEntitiesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntities(entities)
       .build();
     ApiFuture<Operation> future = entityTypesClient.batchUpdateEntitiesCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.batchUpdateEntitiesCallable))))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2.EntityTypesSettings`"
  (^com.google.cloud.dialogflow.v2.EntityTypesSettings [^EntityTypesClient this]
    (-> this (.getSettings))))

(defn create-entity-type-callable
  "Creates an entity type in the specified agent.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     EntityType entityType = EntityType.newBuilder().build();
     CreateEntityTypeRequest request = CreateEntityTypeRequest.newBuilder()
       .setParent(parent.toString())
       .setEntityType(entityType)
       .build();
     ApiFuture<EntityType> future = entityTypesClient.createEntityTypeCallable().futureCall(request);
     // Do something
     EntityType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.CreateEntityTypeRequest,com.google.cloud.dialogflow.v2.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.createEntityTypeCallable))))

(defn batch-delete-entities-operation-callable
  "Deletes entities in the specified entity type.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<String> entityValues = new ArrayList<>();
     BatchDeleteEntitiesRequest request = BatchDeleteEntitiesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntityValues(entityValues)
       .build();
     OperationFuture<Empty, Struct> future = entityTypesClient.batchDeleteEntitiesOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesClient this]
    (-> this (.batchDeleteEntitiesOperationCallable))))

(defn list-entity-types-paged-callable
  "Returns the list of all entity types in the specified agent.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     ListEntityTypesRequest request = ListEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListEntityTypesPagedResponse> future = entityTypesClient.listEntityTypesPagedCallable().futureCall(request);
     // Do something
     for (EntityType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListEntityTypesRequest,com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.listEntityTypesPagedCallable))))

(defn get-entity-type-callable
  "Retrieves the specified entity type.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName name = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     GetEntityTypeRequest request = GetEntityTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<EntityType> future = entityTypesClient.getEntityTypeCallable().futureCall(request);
     // Do something
     EntityType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.GetEntityTypeRequest,com.google.cloud.dialogflow.v2.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.getEntityTypeCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2.stub.EntityTypesStub`"
  ([^EntityTypesClient this]
    (-> this (.getStub))))

(defn list-entity-types-callable
  "Returns the list of all entity types in the specified agent.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     ListEntityTypesRequest request = ListEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListEntityTypesResponse response = entityTypesClient.listEntityTypesCallable().call(request);
       for (EntityType element : response.getEntityTypesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ListEntityTypesRequest,com.google.cloud.dialogflow.v2.ListEntityTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.listEntityTypesCallable))))

(defn batch-update-entities-async
  "Updates or creates multiple entities in the specified entity type. This method does not affect
   entities in the entity type that aren't explicitly specified in the request.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<EntityType.Entity> entities = new ArrayList<>();
     String languageCode = \"\";
     entityTypesClient.batchUpdateEntitiesAsync(parent, entities, languageCode).get();
   }

  parent - Required. The name of the entity type to update or create entities in. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`. - `com.google.cloud.dialogflow.v2.EntityTypeName`
  entities - Required. The entities to update or create. - `java.util.List`
  language-code - Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName parent ^java.util.List entities ^java.lang.String language-code]
    (-> this (.batchUpdateEntitiesAsync parent entities language-code)))
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName parent ^java.util.List entities]
    (-> this (.batchUpdateEntitiesAsync parent entities)))
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest request]
    (-> this (.batchUpdateEntitiesAsync request))))

(defn update-entity-type-callable
  "Updates the specified entity type.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityType entityType = EntityType.newBuilder().build();
     UpdateEntityTypeRequest request = UpdateEntityTypeRequest.newBuilder()
       .setEntityType(entityType)
       .build();
     ApiFuture<EntityType> future = entityTypesClient.updateEntityTypeCallable().futureCall(request);
     // Do something
     EntityType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.UpdateEntityTypeRequest,com.google.cloud.dialogflow.v2.EntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.updateEntityTypeCallable))))

(defn get-entity-type
  "Retrieves the specified entity type.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName name = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     String languageCode = \"\";
     EntityType response = entityTypesClient.getEntityType(name, languageCode);
   }

  name - Required. The name of the entity type. Format: `projects/<Project ID>/agent/entityTypes/<EntityType ID>`. - `com.google.cloud.dialogflow.v2.EntityTypeName`
  language-code - Optional. The language to retrieve entity synonyms for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `com.google.cloud.dialogflow.v2.EntityType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.EntityType [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName name ^java.lang.String language-code]
    (-> this (.getEntityType name language-code)))
  (^com.google.cloud.dialogflow.v2.EntityType [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName name]
    (-> this (.getEntityType name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^EntityTypesClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^EntityTypesClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^EntityTypesClient this]
    (-> this (.shutdown))))

(defn batch-create-entities-async
  "Creates multiple new entities in the specified entity type.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<EntityType.Entity> entities = new ArrayList<>();
     String languageCode = \"\";
     entityTypesClient.batchCreateEntitiesAsync(parent, entities, languageCode).get();
   }

  parent - Required. The name of the entity type to create entities in. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`. - `com.google.cloud.dialogflow.v2.EntityTypeName`
  entities - Required. The entities to create. - `java.util.List`
  language-code - Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName parent ^java.util.List entities ^java.lang.String language-code]
    (-> this (.batchCreateEntitiesAsync parent entities language-code)))
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName parent ^java.util.List entities]
    (-> this (.batchCreateEntitiesAsync parent entities)))
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.BatchCreateEntitiesRequest request]
    (-> this (.batchCreateEntitiesAsync request))))

(defn batch-delete-entity-types-async
  "Deletes entity types in the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     List<String> entityTypeNames = new ArrayList<>();
     entityTypesClient.batchDeleteEntityTypesAsync(parent, entityTypeNames).get();
   }

  parent - Required. The name of the agent to delete all entities types for. Format: `projects/<Project ID>/agent`. - `com.google.cloud.dialogflow.v2.ProjectAgentName`
  entity-type-names - Required. The names entity types to delete. All names must point to the same agent as `parent`. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.ProjectAgentName parent ^java.util.List entity-type-names]
    (-> this (.batchDeleteEntityTypesAsync parent entity-type-names)))
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest request]
    (-> this (.batchDeleteEntityTypesAsync request))))

(defn batch-delete-entities-async
  "Deletes entities in the specified entity type.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<String> entityValues = new ArrayList<>();
     String languageCode = \"\";
     entityTypesClient.batchDeleteEntitiesAsync(parent, entityValues, languageCode).get();
   }

  parent - Required. The name of the entity type to delete entries for. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`. - `com.google.cloud.dialogflow.v2.EntityTypeName`
  entity-values - Required. The canonical `values` of the entities to delete. Note that these are not fully-qualified names, i.e. they don't start with `projects/<Project ID>`. - `java.util.List`
  language-code - Optional. The language of entity synonyms defined in `entities`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName parent ^java.util.List entity-values ^java.lang.String language-code]
    (-> this (.batchDeleteEntitiesAsync parent entity-values language-code)))
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName parent ^java.util.List entity-values]
    (-> this (.batchDeleteEntitiesAsync parent entity-values)))
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest request]
    (-> this (.batchDeleteEntitiesAsync request))))

(defn delete-entity-type-callable
  "Deletes the specified entity type.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName name = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     DeleteEntityTypeRequest request = DeleteEntityTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = entityTypesClient.deleteEntityTypeCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DeleteEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.deleteEntityTypeCallable))))

(defn create-entity-type
  "Creates an entity type in the specified agent.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     EntityType entityType = EntityType.newBuilder().build();
     String languageCode = \"\";
     EntityType response = entityTypesClient.createEntityType(parent, entityType, languageCode);
   }

  parent - Required. The agent to create a entity type for. Format: `projects/<Project ID>/agent`. - `com.google.cloud.dialogflow.v2.ProjectAgentName`
  entity-type - Required. The entity type to create. - `com.google.cloud.dialogflow.v2.EntityType`
  language-code - Optional. The language of entity synonyms defined in `entity_type`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `com.google.cloud.dialogflow.v2.EntityType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.EntityType [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.ProjectAgentName parent ^com.google.cloud.dialogflow.v2.EntityType entity-type ^java.lang.String language-code]
    (-> this (.createEntityType parent entity-type language-code)))
  (^com.google.cloud.dialogflow.v2.EntityType [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.ProjectAgentName parent ^com.google.cloud.dialogflow.v2.EntityType entity-type]
    (-> this (.createEntityType parent entity-type)))
  (^com.google.cloud.dialogflow.v2.EntityType [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.CreateEntityTypeRequest request]
    (-> this (.createEntityType request))))

(defn batch-delete-entity-types-operation-callable
  "Deletes entity types in the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     List<String> entityTypeNames = new ArrayList<>();
     BatchDeleteEntityTypesRequest request = BatchDeleteEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntityTypeNames(entityTypeNames)
       .build();
     OperationFuture<Empty, Struct> future = entityTypesClient.batchDeleteEntityTypesOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesClient this]
    (-> this (.batchDeleteEntityTypesOperationCallable))))

(defn batch-update-entity-types-callable
  "Updates/Creates multiple entity types in the specified agent.

   Operation <response:
   [BatchUpdateEntityTypesResponse][google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     BatchUpdateEntityTypesRequest request = BatchUpdateEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Operation> future = entityTypesClient.batchUpdateEntityTypesCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.batchUpdateEntityTypesCallable))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^EntityTypesClient this]
    (-> this (.getOperationsClient))))

(defn batch-delete-entities-callable
  "Deletes entities in the specified entity type.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<String> entityValues = new ArrayList<>();
     BatchDeleteEntitiesRequest request = BatchDeleteEntitiesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntityValues(entityValues)
       .build();
     ApiFuture<Operation> future = entityTypesClient.batchDeleteEntitiesCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.batchDeleteEntitiesCallable))))

(defn close
  ""
  ([^EntityTypesClient this]
    (-> this (.close))))

(defn batch-create-entities-operation-callable
  "Creates multiple new entities in the specified entity type.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<EntityType.Entity> entities = new ArrayList<>();
     BatchCreateEntitiesRequest request = BatchCreateEntitiesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntities(entities)
       .build();
     OperationFuture<Empty, Struct> future = entityTypesClient.batchCreateEntitiesOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.BatchCreateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesClient this]
    (-> this (.batchCreateEntitiesOperationCallable))))

(defn batch-update-entities-operation-callable
  "Updates or creates multiple entities in the specified entity type. This method does not affect
   entities in the entity type that aren't explicitly specified in the request.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName parent = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     List<EntityType.Entity> entities = new ArrayList<>();
     BatchUpdateEntitiesRequest request = BatchUpdateEntitiesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntities(entities)
       .build();
     OperationFuture<Empty, Struct> future = entityTypesClient.batchUpdateEntitiesOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^EntityTypesClient this]
    (-> this (.batchUpdateEntitiesOperationCallable))))

(defn batch-delete-entity-types-callable
  "Deletes entity types in the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     List<String> entityTypeNames = new ArrayList<>();
     BatchDeleteEntityTypesRequest request = BatchDeleteEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .addAllEntityTypeNames(entityTypeNames)
       .build();
     ApiFuture<Operation> future = entityTypesClient.batchDeleteEntityTypesCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EntityTypesClient this]
    (-> this (.batchDeleteEntityTypesCallable))))

(defn batch-update-entity-types-operation-callable
  "Updates/Creates multiple entity types in the specified agent.

   Operation <response:
   [BatchUpdateEntityTypesResponse][google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse]>

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     BatchUpdateEntityTypesRequest request = BatchUpdateEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     OperationFuture<BatchUpdateEntityTypesResponse, Struct> future = entityTypesClient.batchUpdateEntityTypesOperationCallable().futureCall(request);
     // Do something
     BatchUpdateEntityTypesResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest,com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse,com.google.protobuf.Struct>`"
  ([^EntityTypesClient this]
    (-> this (.batchUpdateEntityTypesOperationCallable))))

(defn list-entity-types
  "Returns the list of all entity types in the specified agent.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     String languageCode = \"\";
     for (EntityType element : entityTypesClient.listEntityTypes(parent, languageCode).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The agent to list all entity types from. Format: `projects/<Project ID>/agent`. - `com.google.cloud.dialogflow.v2.ProjectAgentName`
  language-code - Optional. The language to list entity synonyms for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPagedResponse [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.ProjectAgentName parent ^java.lang.String language-code]
    (-> this (.listEntityTypes parent language-code)))
  (^com.google.cloud.dialogflow.v2.EntityTypesClient$ListEntityTypesPagedResponse [^EntityTypesClient this ^com.google.cloud.dialogflow.v2.ProjectAgentName parent]
    (-> this (.listEntityTypes parent))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^EntityTypesClient this]
    (-> this (.isTerminated))))

(defn delete-entity-type
  "Deletes the specified entity type.

   Sample code:



   try (EntityTypesClient entityTypesClient = EntityTypesClient.create()) {
     EntityTypeName name = EntityTypeName.of(\"[PROJECT]\", \"[ENTITY_TYPE]\");
     entityTypesClient.deleteEntityType(name);
   }

  name - Required. The name of the entity type to delete. Format: `projects/<Project ID>/agent/entityTypes/<EntityType ID>`. - `com.google.cloud.dialogflow.v2.EntityTypeName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^EntityTypesClient this ^com.google.cloud.dialogflow.v2.EntityTypeName name]
    (-> this (.deleteEntityType name))))

(defn shutdown-now
  ""
  ([^EntityTypesClient this]
    (-> this (.shutdownNow))))

