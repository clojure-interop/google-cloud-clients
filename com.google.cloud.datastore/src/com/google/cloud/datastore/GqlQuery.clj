(ns com.google.cloud.datastore.GqlQuery
  "A Google Cloud Datastore GQL query.

  A usage example:

  When the type of the results is known the preferred usage would be:



  Query<Entity> query =
      Query.newGqlQueryBuilder(Query.ResultType.ENTITY, \"select * from kind\").build();
  QueryResults<Entity> results = datastore.run(query);
  while (results.hasNext()) {
    Entity entity = results.next();
    ...
  }

  When the type of the results is unknown you can use this approach:



  Query<?> query = Query.newGqlQueryBuilder(\"select __key__ from kind\").build();
  QueryResults<?> results = datastore.run(query);
  if (Key.class.isAssignableFrom(results.getResultClass())) {
    QueryResults<Key> keys = (QueryResults<Key>) results;
    while (keys.hasNext()) {
      Key key = keys.next();
      ...
    }
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore GqlQuery]))

(defn get-query-string
  "Returns the query string for this query.

  returns: `java.lang.String`"
  (^java.lang.String [^GqlQuery this]
    (-> this (.getQueryString))))

(defn allow-literal
  "Returns whether the query string can contain literals. When false, the query string
   must not contain any literals and instead must bind all values.

  returns: `boolean`"
  (^Boolean [^GqlQuery this]
    (-> this (.allowLiteral))))

(defn get-named-bindings
  "Returns an immutable map of named bindings.

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^GqlQuery this]
    (-> this (.getNamedBindings))))

(defn get-number-args
  "Returns an immutable list of positional bindings (using original order).

  returns: `java.util.List<java.lang.Object>`"
  (^java.util.List [^GqlQuery this]
    (-> this (.getNumberArgs))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GqlQuery this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GqlQuery this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GqlQuery this ^java.lang.Object obj]
    (-> this (.equals obj))))

