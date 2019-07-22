(ns com.google.cloud.bigtable.data.v2.models.Mutation
  "The concrete implementation of MutationApi that can be used to create and represent a
  list of mutations. It used by RowMutation and ConditionalRowMutation to
  encapsulate a list of mutations that will to be applied to a single row."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Mutation]))

(defn *create
  "Creates new instance of Mutation object.

  returns: `com.google.cloud.bigtable.data.v2.models.Mutation`"
  (^com.google.cloud.bigtable.data.v2.models.Mutation []
    (Mutation/create )))

(defn *create-unsafe
  "Creates new instance of Mutation object which allows setCell operation to use server side
   timestamp. This is dangerous because mutations will no longer be idempotent, which might cause
   multiple duplicate values to be stored in Bigtable. This option should only be used for
   advanced usecases with extreme care.

  returns: `com.google.cloud.bigtable.data.v2.models.Mutation`"
  (^com.google.cloud.bigtable.data.v2.models.Mutation []
    (Mutation/createUnsafe )))

(defn *from-proto-unsafe
  "Wraps the List of protobuf Mutation. This methods, like createUnsafe(), allows setCell operation to use server side timestamp. This is dangerous
   because mutations will no longer be idempotent, which might cause multiple duplicate values to
   be stored in Bigtable. This option should only be used for advanced usecases with extreme care.

  protos - `java.util.List`

  returns: `com.google.cloud.bigtable.data.v2.models.Mutation`"
  (^com.google.cloud.bigtable.data.v2.models.Mutation [^java.util.List protos]
    (Mutation/fromProtoUnsafe protos)))

(defn set-cell
  "Description copied from interface: MutationApi

  family-name - `java.lang.String`
  qualifier - `java.lang.String`
  timestamp - `long`
  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Mutation`"
  (^com.google.cloud.bigtable.data.v2.models.Mutation [^Mutation this ^java.lang.String family-name ^java.lang.String qualifier ^Long timestamp ^java.lang.String value]
    (-> this (.setCell family-name qualifier timestamp value)))
  (^com.google.cloud.bigtable.data.v2.models.Mutation [^Mutation this ^java.lang.String family-name ^java.lang.String qualifier ^java.lang.String value]
    (-> this (.setCell family-name qualifier value))))

(defn delete-cells
  "Description copied from interface: MutationApi

  family-name - The family name. - `java.lang.String`
  qualifier - The qualifier. - `com.google.protobuf.ByteString`
  timestamp-range - The timestamp range in microseconds. - `com.google.cloud.bigtable.data.v2.models.Range$TimestampRange`

  returns: `com.google.cloud.bigtable.data.v2.models.Mutation`"
  (^com.google.cloud.bigtable.data.v2.models.Mutation [^Mutation this ^java.lang.String family-name ^com.google.protobuf.ByteString qualifier ^com.google.cloud.bigtable.data.v2.models.Range$TimestampRange timestamp-range]
    (-> this (.deleteCells family-name qualifier timestamp-range)))
  (^com.google.cloud.bigtable.data.v2.models.Mutation [^Mutation this ^java.lang.String family-name ^java.lang.String qualifier]
    (-> this (.deleteCells family-name qualifier))))

(defn delete-family
  "Description copied from interface: MutationApi

  family-name - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Mutation`"
  (^com.google.cloud.bigtable.data.v2.models.Mutation [^Mutation this ^java.lang.String family-name]
    (-> this (.deleteFamily family-name))))

(defn delete-row
  "Description copied from interface: MutationApi

  returns: `com.google.cloud.bigtable.data.v2.models.Mutation`"
  (^com.google.cloud.bigtable.data.v2.models.Mutation [^Mutation this]
    (-> this (.deleteRow))))

