(ns com.google.cloud.firestore.Query
  "A Query which you can read or listen to. You can also construct refined Query objects by adding
  filters and ordering."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore Query]))

(defn stream
  "Executes the query and streams the results as a StreamObserver of DocumentSnapshots.

  response-observer - The observer to be notified when results arrive. - `com.google.api.gax.rpc.ApiStreamObserver`"
  ([^Query this ^com.google.api.gax.rpc.ApiStreamObserver response-observer]
    (-> this (.stream response-observer))))

(defn start-at
  "Creates and returns a new Query that starts at the provided document (inclusive). The starting
   position is relative to the order of the query. The document must contain all of the fields
   provided in the orderBy of this query.

  snapshot - The snapshot of the document to start at. - `com.google.cloud.firestore.DocumentSnapshot`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^com.google.cloud.firestore.DocumentSnapshot snapshot]
    (-> this (.startAt snapshot))))

(defn get-firestore
  "Gets the Firestore instance associated with this query.

  returns: The Firestore instance associated with this query. - `com.google.cloud.firestore.Firestore`"
  (^com.google.cloud.firestore.Firestore [^Query this]
    (-> this (.getFirestore))))

(defn offset
  "Creates and returns a new Query that skips the first n results.

  offset - The number of items to skip. - `int`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^Integer offset]
    (-> this (.offset offset))))

(defn where-less-than
  "Creates and returns a new Query with the additional filter that documents must contain the
   specified field and the value should be less than the specified value.

  field - The name of the field to compare. - `java.lang.String`
  value - The value for comparison. - `java.lang.Object`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field ^java.lang.Object value]
    (-> this (.whereLessThan field value))))

(defn where-less-than-or-equal-to
  "Creates and returns a new Query with the additional filter that documents must contain the
   specified field and the value should be less or equal to the specified value.

  field - The name of the field to compare. - `java.lang.String`
  value - The value for comparison. - `java.lang.Object`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field ^java.lang.Object value]
    (-> this (.whereLessThanOrEqualTo field value))))

(defn limit
  "Creates and returns a new Query that's additionally limited to only return up to the specified
   number of documents.

  limit - The maximum number of items to return. - `int`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^Integer limit]
    (-> this (.limit limit))))

(defn order-by
  "Creates and returns a new Query that's additionally sorted by the specified field, optionally
   in descending order instead of ascending.

  field - The field to sort by. - `java.lang.String`
  direction - The direction to sort. - `com.google.cloud.firestore.Query$Direction`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field ^com.google.cloud.firestore.Query$Direction direction]
    (-> this (.orderBy field direction)))
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field]
    (-> this (.orderBy field))))

(defn where-array-contains
  "Creates and returns a new Query with the additional filter that documents must contain the
   specified field, the value must be an array, and that the array must contain the provided
   value.

   A Query can have only one whereArrayContains() filter.

  field - The name of the field containing an array to search - `java.lang.String`
  value - The value that must be contained in the array - `java.lang.Object`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field ^java.lang.Object value]
    (-> this (.whereArrayContains field value))))

(defn select
  "Creates and returns a new Query instance that applies a field mask to the result and returns
   the specified subset of fields. You can specify a list of field paths to return, or use an
   empty list to only return the references of matching documents.

  fields - The fields to include. - `java.lang.String`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String fields]
    (-> this (.select fields))))

(defn where-greater-than
  "Creates and returns a new Query with the additional filter that documents must contain the
   specified field and the value should be greater than the specified value.

  field - The name of the field to compare. - `java.lang.String`
  value - The value for comparison. - `java.lang.Object`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field ^java.lang.Object value]
    (-> this (.whereGreaterThan field value))))

(defn start-after
  "Creates and returns a new Query that starts after the provided document (exclusive). The
   starting position is relative to the order of the query. The document must contain all of the
   fields provided in the orderBy of this query.

  snapshot - The snapshot of the document to start after. - `com.google.cloud.firestore.DocumentSnapshot`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^com.google.cloud.firestore.DocumentSnapshot snapshot]
    (-> this (.startAfter snapshot))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Query this]
    (-> this (.hashCode))))

(defn end-before
  "Creates and returns a new Query that ends before the provided document (exclusive). The end
   position is relative to the order of the query. The document must contain all of the fields
   provided in the orderBy of this query.

  snapshot - The snapshot of the document to end before. - `com.google.cloud.firestore.DocumentSnapshot`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^com.google.cloud.firestore.DocumentSnapshot snapshot]
    (-> this (.endBefore snapshot))))

(defn add-snapshot-listener
  "Starts listening to this query.

  executor - The executor to use to call the listener. - `java.util.concurrent.Executor`
  listener - The event listener that will be called with the snapshots. - `com.google.cloud.firestore.EventListener`

  returns: A registration object that can be used to remove the listener. - `com.google.cloud.firestore.ListenerRegistration`"
  (^com.google.cloud.firestore.ListenerRegistration [^Query this ^java.util.concurrent.Executor executor ^com.google.cloud.firestore.EventListener listener]
    (-> this (.addSnapshotListener executor listener)))
  (^com.google.cloud.firestore.ListenerRegistration [^Query this ^com.google.cloud.firestore.EventListener listener]
    (-> this (.addSnapshotListener listener))))

(defn where-greater-than-or-equal-to
  "Creates and returns a new Query with the additional filter that documents must contain the
   specified field and the value should be greater than or equal to the specified value.

  field - The name of the field to compare. - `java.lang.String`
  value - The value for comparison. - `java.lang.Object`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field ^java.lang.Object value]
    (-> this (.whereGreaterThanOrEqualTo field value))))

(defn end-at
  "Creates and returns a new Query that ends at the provided fields relative to the order of the
   query. The order of the field values must match the order of the order by clauses of the query.

  field-values - The field values to end this query at, in order of the query's order by. - `java.lang.Object`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.Object field-values]
    (-> this (.endAt field-values))))

(defn get
  "Executes the query and returns the results as QuerySnapshot.

  returns: An ApiFuture that will be resolved with the results of the Query. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.QuerySnapshot>`"
  (^com.google.api.core.ApiFuture [^Query this]
    (-> this (.get))))

(defn equals
  "Returns true if this Query is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this Query is equal to the provided object. - `boolean`"
  (^Boolean [^Query this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn where-equal-to
  "Creates and returns a new Query with the additional filter that documents must contain the
   specified field and the value should be equal to the specified value.

  field - The name of the field to compare. - `java.lang.String`
  value - The value for comparison. - `java.lang.Object`

  returns: The created Query. - `com.google.cloud.firestore.Query`"
  (^com.google.cloud.firestore.Query [^Query this ^java.lang.String field ^java.lang.Object value]
    (-> this (.whereEqualTo field value))))

