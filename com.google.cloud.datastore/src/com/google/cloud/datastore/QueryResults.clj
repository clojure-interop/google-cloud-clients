(ns com.google.cloud.datastore.QueryResults
  "The result of a Google Cloud Datastore query submission. When the result is not typed it is
  possible to cast it to its appropriate type according to the getResultClass() value.
  Results are loaded lazily in batches, where batch size is set by Cloud Datastore. As a result, it
  is possible to get a DatastoreException upon hasNext or next calls."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore QueryResults]))

(defn get-result-class
  "Returns the actual class of the result's values.

  returns: `java.lang.Class<?>`"
  (^java.lang.Class [^QueryResults this]
    (-> this (.getResultClass))))

(defn get-cursor-after
  "Returns the Cursor for the point after the value returned in the last Iterator.next() call. This
   cursor can be used to issue subsequent queries (with the same constraints) that may return
   additional results.

   A simple use case:



   Query<Entity> query = Query.newEntityQueryBuilder()
       .setKind(\"Person\")
       .setFilter(PropertyFilter.eq(\"favoriteFood\", \"pizza\"))
       .build();
   QueryResults<Entity> results = datastore.run(query);
   // Consume some results (using results.next()) and do any other actions as necessary.
   query = query.toBuilder().setStartCursor(results.getCursorAfter()).build();
   results = datastore.run(query); // now we will iterate over all entities not yet consumed

  returns: `com.google.cloud.datastore.Cursor`"
  (^com.google.cloud.datastore.Cursor [^QueryResults this]
    (-> this (.getCursorAfter))))

(defn get-skipped-results
  "Returns the number of results skipped, typically because of an offset.

   A simple use case to count entities:



   Query<Key> query = Query.newKeyQueryBuilder().setOffset(Integer.MAX_VALUE).build();
   QueryResults<Key> result = datasore.datastore.run(query);
   if (!result.hasNext()) {
    int numberOfEntities = result.getSkippedResults();
   }

  returns: `int`"
  (^Integer [^QueryResults this]
    (-> this (.getSkippedResults))))

(defn get-more-results
  "Returns MoreResults state of the query after the current batch.

  returns: `com.google.datastore.v1.QueryResultBatch$MoreResultsType`"
  (^com.google.datastore.v1.QueryResultBatch$MoreResultsType [^QueryResults this]
    (-> this (.getMoreResults))))

