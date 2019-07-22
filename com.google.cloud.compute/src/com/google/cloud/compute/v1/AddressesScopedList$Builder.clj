(ns com.google.cloud.compute.v1.AddressesScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddressesScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AddressesScopedList`

  returns: `com.google.cloud.compute.v1.AddressesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder [^AddressesScopedList$Builder this ^com.google.cloud.compute.v1.AddressesScopedList other]
    (-> this (.mergeFrom other))))

(defn get-addresses-list
  "[Output Only] A list of addresses contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Address>`"
  (^java.util.List [^AddressesScopedList$Builder this]
    (-> this (.getAddressesList))))

(defn add-all-addresses
  "[Output Only] A list of addresses contained in this scope.

  addresses - `java.util.List`

  returns: `com.google.cloud.compute.v1.AddressesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder [^AddressesScopedList$Builder this ^java.util.List addresses]
    (-> this (.addAllAddresses addresses))))

(defn add-addresses
  "[Output Only] A list of addresses contained in this scope.

  addresses - `com.google.cloud.compute.v1.Address`

  returns: `com.google.cloud.compute.v1.AddressesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder [^AddressesScopedList$Builder this ^com.google.cloud.compute.v1.Address addresses]
    (-> this (.addAddresses addresses))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of addresses when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AddressesScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of addresses when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.AddressesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder [^AddressesScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.AddressesScopedList`"
  (^com.google.cloud.compute.v1.AddressesScopedList [^AddressesScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AddressesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder [^AddressesScopedList$Builder this]
    (-> this (.clone))))

