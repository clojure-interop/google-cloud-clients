(ns com.google.cloud.datastore.Query
  "A Google Cloud Datastore query. For usage examples see GqlQuery and StructuredQuery.

  Note that queries require proper indexing. See Cloud Datastore Index
  Configuration for help configuring indexes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Query]))

(defn *new-gql-query-builder
  "Returns a new GqlQuery builder.

   Example of creating and running a typed GQL query.



   String kind = \"my_kind\";
   String gqlQuery = \"select * from \"  kind;
   Query<Entity> query = Query.newGqlQueryBuilder(Query.ResultType.ENTITY, gqlQuery).build();
   QueryResults<Entity> results = datastore.run(query);
   // Use results

  result-type - `com.google.cloud.datastore.Query$ResultType`
  gql - `java.lang.String`

  returns: `<V> com.google.cloud.datastore.GqlQuery$Builder<V>`"
  ([^com.google.cloud.datastore.Query$ResultType result-type ^java.lang.String gql]
    (Query/newGqlQueryBuilder result-type gql))
  (^com.google.cloud.datastore.GqlQuery$Builder [^java.lang.String gql]
    (Query/newGqlQueryBuilder gql)))

(defn *new-entity-query-builder
  "Returns a new StructuredQuery builder for full (complete entities) queries.

   Example of creating and running an entity query.



   String kind = \"my_kind\";
   Query<Entity> query = Query.newEntityQueryBuilder().setKind(kind).build();
   QueryResults<Entity> results = datastore.run(query);
   // Use results

  returns: `com.google.cloud.datastore.EntityQuery$Builder`"
  (^com.google.cloud.datastore.EntityQuery$Builder []
    (Query/newEntityQueryBuilder )))

(defn *new-key-query-builder
  "Returns a new StructuredQuery builder for key only queries.

   Example of creating and running a key query.



   String kind = \"my_kind\";
   Query<Key> query = Query.newKeyQueryBuilder().setKind(kind).build();
   QueryResults<Key> results = datastore.run(query);
   // Use results

  returns: `com.google.cloud.datastore.KeyQuery$Builder`"
  (^com.google.cloud.datastore.KeyQuery$Builder []
    (Query/newKeyQueryBuilder )))

(defn *new-projection-entity-query-builder
  "Returns a new StructuredQuery builder for projection queries.

   Example of creating and running a projection entity query.



   String kind = \"my_kind\";
   String property = \"my_property\";
   Query<ProjectionEntity> query = Query.newProjectionEntityQueryBuilder()
       .setKind(kind)
       .addProjection(property)
       .build();
   QueryResults<ProjectionEntity> results = datastore.run(query);
   // Use results

  returns: `com.google.cloud.datastore.ProjectionEntityQuery$Builder`"
  (^com.google.cloud.datastore.ProjectionEntityQuery$Builder []
    (Query/newProjectionEntityQueryBuilder )))

(defn get-namespace
  "returns: `java.lang.String`"
  (^java.lang.String [^Query this]
    (-> this (.getNamespace))))

