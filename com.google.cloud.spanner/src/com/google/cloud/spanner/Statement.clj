(ns com.google.cloud.spanner.Statement
  "A SQL statement and optional bound parameters that can be executed in a ReadContext.

  The SQL query string can contain parameter placeholders. A parameter placeholder consists of
  @ followed by the parameter name. Parameter names consist of any combination of
  letters, numbers, and underscores.

  Parameters can appear anywhere that a literal value is expected. The same parameter name can
  be used more than once, for example: WHERE id > @msg_id AND id < @msg_id  100

  It is an error to execute an SQL query with placeholders for unbound parameters.

  Statements are constructed using a builder. Parameter values are specified by calling Statement.Builder.bind(String). For example, code to build a query using the clause above and bind a value
  to id might look like the following:



  Statement statement = Statement
      .newBuilder(\"SELECT name WHERE id > @msg_id AND id < @msg_id  100\")
      .bind(\"msg_id\").to(500)
      .build();

  Statement instances are immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Statement]))

(defn *of
  "Creates a Statement with the given SQL text sql.

  sql - `java.lang.String`

  returns: `com.google.cloud.spanner.Statement`"
  (^com.google.cloud.spanner.Statement [^java.lang.String sql]
    (Statement/of sql)))

(defn *new-builder
  "Creates a new statement builder with the SQL text sql.

  sql - `java.lang.String`

  returns: `com.google.cloud.spanner.Statement$Builder`"
  (^com.google.cloud.spanner.Statement$Builder [^java.lang.String sql]
    (Statement/newBuilder sql)))

(defn has-binding?
  "Returns true if a binding exists for parameter.

  parameter - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Statement this ^java.lang.String parameter]
    (-> this (.hasBinding parameter))))

(defn execute-query
  "Executes the query in context. statement.executeQuery(context) is exactly
   equivalent to context.executeQuery(statement).

  context - `com.google.cloud.spanner.ReadContext`
  options - `com.google.cloud.spanner.Options$QueryOption`

  returns: `com.google.cloud.spanner.ResultSet`"
  (^com.google.cloud.spanner.ResultSet [^Statement this ^com.google.cloud.spanner.ReadContext context ^com.google.cloud.spanner.Options$QueryOption options]
    (-> this (.executeQuery context options))))

(defn analyze-query
  "Analyzes the query in context. statement.analyzeQuery(context, queryMode) is
   exactly equivalent to context.analyzeQuery(statement, queryMode).

  context - `com.google.cloud.spanner.ReadContext`
  query-mode - `com.google.cloud.spanner.ReadContext$QueryAnalyzeMode`

  returns: `com.google.cloud.spanner.ResultSet`"
  (^com.google.cloud.spanner.ResultSet [^Statement this ^com.google.cloud.spanner.ReadContext context ^com.google.cloud.spanner.ReadContext$QueryAnalyzeMode query-mode]
    (-> this (.analyzeQuery context query-mode))))

(defn get-sql
  "Returns the current SQL statement text.

  returns: `java.lang.String`"
  (^java.lang.String [^Statement this]
    (-> this (.getSql))))

(defn get-parameters
  "Returns the parameters bound to this Statement.

  returns: `java.util.Map<java.lang.String,com.google.cloud.spanner.Value>`"
  (^java.util.Map [^Statement this]
    (-> this (.getParameters))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Statement this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Statement this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Statement this]
    (-> this (.hashCode))))

