(ns com.google.cloud.compute.v1.CommitmentsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CommitmentsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.CommitmentsScopedList`

  returns: `com.google.cloud.compute.v1.CommitmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder [^CommitmentsScopedList$Builder this ^com.google.cloud.compute.v1.CommitmentsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-commitments-list
  "[Output Only] A list of commitments contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Commitment>`"
  (^java.util.List [^CommitmentsScopedList$Builder this]
    (-> this (.getCommitmentsList))))

(defn add-all-commitments
  "[Output Only] A list of commitments contained in this scope.

  commitments - `java.util.List`

  returns: `com.google.cloud.compute.v1.CommitmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder [^CommitmentsScopedList$Builder this ^java.util.List commitments]
    (-> this (.addAllCommitments commitments))))

(defn add-commitments
  "[Output Only] A list of commitments contained in this scope.

  commitments - `com.google.cloud.compute.v1.Commitment`

  returns: `com.google.cloud.compute.v1.CommitmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder [^CommitmentsScopedList$Builder this ^com.google.cloud.compute.v1.Commitment commitments]
    (-> this (.addCommitments commitments))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of commitments when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^CommitmentsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of commitments when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.CommitmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder [^CommitmentsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.CommitmentsScopedList`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList [^CommitmentsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.CommitmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder [^CommitmentsScopedList$Builder this]
    (-> this (.clone))))

