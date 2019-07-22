(ns com.google.cloud.compute.deprecated.OperationId
  "Base class for Google Compute Engine operation identities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated OperationId]))

(defn get-type
  "Returns the type of this operation identity.

  returns: `com.google.cloud.compute.deprecated.OperationId.Type`"
  (^com.google.cloud.compute.deprecated.OperationId.Type [^OperationId this]
    (-> this (.getType))))

(defn get-operation
  "Returns the name of the operation resource.

  returns: `java.lang.String`"
  (^java.lang.String [^OperationId this]
    (-> this (.getOperation))))

