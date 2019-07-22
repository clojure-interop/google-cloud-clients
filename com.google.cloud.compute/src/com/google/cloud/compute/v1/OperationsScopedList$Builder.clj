(ns com.google.cloud.compute.v1.OperationsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 OperationsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.OperationsScopedList`

  returns: `com.google.cloud.compute.v1.OperationsScopedList$Builder`"
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder [^OperationsScopedList$Builder this ^com.google.cloud.compute.v1.OperationsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-operations-list
  "[Output Only] A list of operations contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Operation>`"
  (^java.util.List [^OperationsScopedList$Builder this]
    (-> this (.getOperationsList))))

(defn add-all-operations
  "[Output Only] A list of operations contained in this scope.

  operations - `java.util.List`

  returns: `com.google.cloud.compute.v1.OperationsScopedList$Builder`"
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder [^OperationsScopedList$Builder this ^java.util.List operations]
    (-> this (.addAllOperations operations))))

(defn add-operations
  "[Output Only] A list of operations contained in this scope.

  operations - `com.google.cloud.compute.v1.Operation`

  returns: `com.google.cloud.compute.v1.OperationsScopedList$Builder`"
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder [^OperationsScopedList$Builder this ^com.google.cloud.compute.v1.Operation operations]
    (-> this (.addOperations operations))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of operations when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^OperationsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of operations when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.OperationsScopedList$Builder`"
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder [^OperationsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.OperationsScopedList`"
  (^com.google.cloud.compute.v1.OperationsScopedList [^OperationsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.OperationsScopedList$Builder`"
  (^com.google.cloud.compute.v1.OperationsScopedList$Builder [^OperationsScopedList$Builder this]
    (-> this (.clone))))

