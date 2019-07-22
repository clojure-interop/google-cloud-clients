(ns com.google.cloud.bigtable.data.v2.models.RowMutation
  "Represents a list of mutations targeted at a single row. It's meant to be used as an parameter
  for BigtableDataClient.mutateRowAsync(RowMutation)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models RowMutation]))

(defn *create
  "Creates new instance of mutation builder by wrapping existing set of row mutations. The builder
   will be owned by this RowMutation and should not be used by the caller after this call. This
   functionality is intended for advanced usage.

   Sample code:



   Mutation mutation = Mutation.create()
       .setCell(\"[FAMILY_NAME]\", \"[QUALIFIER]\", [TIMESTAMP], \"[VALUE]\");
   RowMutation rowMutation = RowMutation.create(\"[TABLE]\", \"[ROW_KEY]\", mutation);

  table-id - `java.lang.String`
  key - `java.lang.String`
  mutation - `com.google.cloud.bigtable.data.v2.models.Mutation`

  returns: `com.google.cloud.bigtable.data.v2.models.RowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^java.lang.String table-id ^java.lang.String key ^com.google.cloud.bigtable.data.v2.models.Mutation mutation]
    (RowMutation/create table-id key mutation))
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^java.lang.String table-id ^java.lang.String key]
    (RowMutation/create table-id key)))

(defn set-cell
  "Description copied from interface: MutationApi

  family-name - `java.lang.String`
  qualifier - `java.lang.String`
  timestamp - `long`
  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.RowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^RowMutation this ^java.lang.String family-name ^java.lang.String qualifier ^Long timestamp ^java.lang.String value]
    (-> this (.setCell family-name qualifier timestamp value)))
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^RowMutation this ^java.lang.String family-name ^java.lang.String qualifier ^java.lang.String value]
    (-> this (.setCell family-name qualifier value))))

(defn delete-cells
  "Description copied from interface: MutationApi

  family-name - The family name. - `java.lang.String`
  qualifier - The qualifier. - `com.google.protobuf.ByteString`
  timestamp-range - The timestamp range in microseconds. - `com.google.cloud.bigtable.data.v2.models.Range$TimestampRange`

  returns: `com.google.cloud.bigtable.data.v2.models.RowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^RowMutation this ^java.lang.String family-name ^com.google.protobuf.ByteString qualifier ^com.google.cloud.bigtable.data.v2.models.Range$TimestampRange timestamp-range]
    (-> this (.deleteCells family-name qualifier timestamp-range)))
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^RowMutation this ^java.lang.String family-name ^java.lang.String qualifier]
    (-> this (.deleteCells family-name qualifier))))

(defn delete-family
  "Description copied from interface: MutationApi

  family-name - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.RowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^RowMutation this ^java.lang.String family-name]
    (-> this (.deleteFamily family-name))))

(defn delete-row
  "Description copied from interface: MutationApi

  returns: `com.google.cloud.bigtable.data.v2.models.RowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.RowMutation [^RowMutation this]
    (-> this (.deleteRow))))

(defn to-proto
  "request-context - `com.google.cloud.bigtable.data.v2.internal.RequestContext`

  returns: `com.google.bigtable.v2.MutateRowRequest`"
  (^com.google.bigtable.v2.MutateRowRequest [^RowMutation this ^com.google.cloud.bigtable.data.v2.internal.RequestContext request-context]
    (-> this (.toProto request-context))))

(defn to-bulk-proto
  "Creates a single entry bulk MutateRowsRequest, which will be
   merged by the batching logic in the callable chain.

  request-context - `com.google.cloud.bigtable.data.v2.internal.RequestContext`

  returns: `com.google.bigtable.v2.MutateRowsRequest`"
  (^com.google.bigtable.v2.MutateRowsRequest [^RowMutation this ^com.google.cloud.bigtable.data.v2.internal.RequestContext request-context]
    (-> this (.toBulkProto request-context))))

