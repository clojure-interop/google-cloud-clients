(ns com.google.cloud.spanner.ResultSet
  "Provides access to the data returned by a Cloud Spanner read or query. ResultSet allows a
  single row to be inspected at a time through the methods from the StructReader interface,
  in the order that the rows were returned by the read or query. The result set can be positioned
  over the next row, if one exists, by calling next(); this method returns false
  when all rows returned have been seen. The result set is initially positioned before the first
  row, so a call to next() is required before the first row can be inspected.

  ResultSet implementations may buffer data ahead and/or maintain a persistent streaming
  connection to the remote service until all data has been returned or the resultSet closed. As
  such, it is important that all uses of ResultSet either fully consume it (that is, call
  next() until false is returned or it throws an exception) or explicitly call
  close(): failure to do so may result in wasted work or leaked resources.

  ResultSet implementations are not required to be thread-safe: if methods are called
  from multiple threads, external synchronization must be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ResultSet]))

(defn next
  "Advances the result set to the next row, returning false if no such row exists. This method may
   block.

  returns: `boolean`

  throws: com.google.cloud.spanner.SpannerException"
  (^Boolean [^ResultSet this]
    (-> this (.next))))

(defn get-current-row-as-struct
  "Creates an immutable version of the row that the result set is positioned over. This may
   involve copying internal data structures, and so converting all rows to Struct objects
   is generally more expensive than processing the ResultSet directly.

  returns: `com.google.cloud.spanner.Struct`"
  (^com.google.cloud.spanner.Struct [^ResultSet this]
    (-> this (.getCurrentRowAsStruct))))

(defn close
  "Explicitly close the result set, releasing any associated resources. This must always be called
   when disposing of a ResultSet before next() has returned false or
   raised an exception. Calling close() is also allowed if the result set has been fully
   consumed, so a recommended practice is to unconditionally close the result set once it is done
   with, typically using a try-with-resources construct."
  ([^ResultSet this]
    (-> this (.close))))

(defn get-stats
  "Returns the ResultSetStats for the query only if the query was executed in either the
   PLAN or the PROFILE mode via the ReadContext.analyzeQuery(Statement,
   com.google.cloud.spanner.ReadContext.QueryAnalyzeMode) method or for DML statements in ReadContext#executeQuery(Statement, QueryOption...). Attempts to call this method on a ResultSet not obtained from analyzeQuery or executeQuery will return a null ResultSetStats. This method must be called after next() has
   returned @{code false}. Calling it before that will result in null ResultSetStats too.

  returns: `com.google.spanner.v1.ResultSetStats`"
  (^com.google.spanner.v1.ResultSetStats [^ResultSet this]
    (-> this (.getStats))))

