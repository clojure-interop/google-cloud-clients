(ns com.google.cloud.spanner.ReadContext
  "A concurrency context in which to run a read or SQL statement. All ReadContexts are
  implicitly bound to a Session and therefore a particular Database."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ReadContext]))

(defn read
  "Reads zero or more rows from a database.

   Implementations may or may not block in the initial read(...) call; for those that
   do not, the remote call will be initiated immediately but blocking on the response is deferred
   to the first ResultSet.next() call. Regardless of blocking behavior, any SpannerException is deferred to the first or subsequent ResultSet.next() call.
   SNIPPET read_context_read



   ReadContext readContext = dbClient.singleUse();
   ResultSet resultSet =
       readContext.read(
           \"Albums\",
           // KeySet.all() can be used to read all rows in a table. KeySet exposes other
           // methods to read only a subset of the table.
           KeySet.all(),
           Arrays.asList(\"SingerId\", \"AlbumId\", \"AlbumTitle\"));

   SNIPPET read_context_read

  table - the name of the table to read - `java.lang.String`
  keys - the keys and ranges of rows to read. Regardless of ordering in keys, rows are returned in their natural key order. - `com.google.cloud.spanner.KeySet`
  columns - the columns to read - `java.lang.Iterable`
  options - the options to configure the read - `com.google.cloud.spanner.Options$ReadOption`

  returns: `com.google.cloud.spanner.ResultSet`"
  (^com.google.cloud.spanner.ResultSet [^ReadContext this ^java.lang.String table ^com.google.cloud.spanner.KeySet keys ^java.lang.Iterable columns ^com.google.cloud.spanner.Options$ReadOption options]
    (-> this (.read table keys columns options))))

(defn read-using-index
  "Reads zero or more rows from a database using an index.

   Implementations may or may not block in the initial read(...) call; for those that
   do not, the remote call will be initiated immediately but blocking on the response is deferred
   to the first ResultSet.next() call. Regardless of blocking behavior, any SpannerException is deferred to the first or subsequent ResultSet.next() call.
   SNIPPET read_context_read_index



   ReadContext readContext = dbClient.singleUse();
   Struct row =
       readContext.readRowUsingIndex(\"Albums\", \"AlbumsByAlbumId\", Key.of(1, \"Green\"),
           Arrays.asList(\"AlbumId\", \"AlbumTitle\"));

   SNIPPET read_context_read_index

  table - the name of the table to read - `java.lang.String`
  index - the name of the index on table to use - `java.lang.String`
  keys - the keys and ranges of index rows to read. Regardless of ordering in keys, rows are returned in the natural key order of the index. - `com.google.cloud.spanner.KeySet`
  columns - the columns to read - `java.lang.Iterable`
  options - the options to configure the read - `com.google.cloud.spanner.Options$ReadOption`

  returns: `com.google.cloud.spanner.ResultSet`"
  (^com.google.cloud.spanner.ResultSet [^ReadContext this ^java.lang.String table ^java.lang.String index ^com.google.cloud.spanner.KeySet keys ^java.lang.Iterable columns ^com.google.cloud.spanner.Options$ReadOption options]
    (-> this (.readUsingIndex table index keys columns options))))

(defn read-row
  "Reads a single row from a database, returning null if the row does not exist.
   SNIPPET read_context_read_row



   ReadContext readContext = dbClient.singleUse();
   Struct row =
       readContext.readRow(\"Albums\", Key.of(2, 1), Arrays.asList(\"MarketingBudget\"));

   SNIPPET read_context_read_row

  table - the name of the table to read - `java.lang.String`
  key - the row to read - `com.google.cloud.spanner.Key`
  columns - the columns to return - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Struct`"
  (^com.google.cloud.spanner.Struct [^ReadContext this ^java.lang.String table ^com.google.cloud.spanner.Key key ^java.lang.Iterable columns]
    (-> this (.readRow table key columns))))

(defn read-row-using-index
  "Reads a single row from a database using an index, returning null if the row does not
   exist.
   SNIPPET read_context_read_index



   ReadContext readContext = dbClient.singleUse();
   Struct row =
       readContext.readRowUsingIndex(\"Albums\", \"AlbumsByAlbumId\", Key.of(1, \"Green\"),
           Arrays.asList(\"AlbumId\", \"AlbumTitle\"));

   SNIPPET read_context_read_index

  table - the name of the table to read - `java.lang.String`
  index - the name of the index on table to use - `java.lang.String`
  key - the index row to read - `com.google.cloud.spanner.Key`
  columns - the columns to return - `java.lang.Iterable`

  returns: `com.google.cloud.spanner.Struct`"
  (^com.google.cloud.spanner.Struct [^ReadContext this ^java.lang.String table ^java.lang.String index ^com.google.cloud.spanner.Key key ^java.lang.Iterable columns]
    (-> this (.readRowUsingIndex table index key columns))))

(defn execute-query
  "Executes a query against the database.

   Implementations may or may not block in the initial executeQuery(...) call; for
   those that do not, the remote call will be initiated immediately but blocking on the response
   is deferred to the first ResultSet.next() call. Regardless of blocking behavior, any
   SpannerException is deferred to the first or subsequent ResultSet.next() call.
   SNIPPET read_context_execute_query



   // Rows without an explicit value for MarketingBudget will have a MarketingBudget equal to
   // null.
   ReadContext readContext = dbClient.singleUse();
   ResultSet resultSet =
       readContext.executeQuery(
           Statement.of(
               \"SELECT SingerId, AlbumId, MarketingBudget, LastUpdateTime FROM Albums\"));

   SNIPPET read_context_execute_query

  statement - the query statement to execute - `com.google.cloud.spanner.Statement`
  options - the options to configure the query - `com.google.cloud.spanner.Options$QueryOption`

  returns: `com.google.cloud.spanner.ResultSet`"
  (^com.google.cloud.spanner.ResultSet [^ReadContext this ^com.google.cloud.spanner.Statement statement ^com.google.cloud.spanner.Options$QueryOption options]
    (-> this (.executeQuery statement options))))

(defn analyze-query
  "Analyzes a query and returns query plan and/or query execution statistics information.

   The query plan and query statistics information is contained in ResultSetStats that can be accessed by calling ResultSet.getStats() on the returned ResultSet.
   SNIPPET read_context_analyze_query



   ReadContext rc = dbClient.singleUse();
   ResultSet resultSet =
       rc.analyzeQuery(
           Statement.of(\"SELECT SingerId, AlbumId, MarketingBudget FROM Albums\"),
           ReadContext.QueryAnalyzeMode.PROFILE);
   while (resultSet.next()) {
     // Discard the results. We're only processing because getStats() below requires it.
     resultSet.getCurrentRowAsStruct();
   }
   ResultSetStats stats = resultSet.getStats();

   SNIPPET read_context_analyze_query

  statement - the query statement to execute - `com.google.cloud.spanner.Statement`
  query-mode - the mode in which to execute the query - `com.google.cloud.spanner.ReadContext$QueryAnalyzeMode`

  returns: `com.google.cloud.spanner.ResultSet`"
  (^com.google.cloud.spanner.ResultSet [^ReadContext this ^com.google.cloud.spanner.Statement statement ^com.google.cloud.spanner.ReadContext$QueryAnalyzeMode query-mode]
    (-> this (.analyzeQuery statement query-mode))))

(defn close
  "Closes this read context and frees up the underlying resources."
  ([^ReadContext this]
    (-> this (.close))))

