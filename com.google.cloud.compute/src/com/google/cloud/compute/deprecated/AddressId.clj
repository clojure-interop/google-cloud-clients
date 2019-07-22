(ns com.google.cloud.compute.deprecated.AddressId
  "Base class for Google Compute Engine address identities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressId]))

(defn get-type
  "Returns the type of this address identity.

  returns: `com.google.cloud.compute.deprecated.AddressId.Type`"
  (^com.google.cloud.compute.deprecated.AddressId.Type [^AddressId this]
    (-> this (.getType))))

(defn get-address
  "Returns the name of the address resource. The name must be 1-63 characters long and comply with
   RFC1035. Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a lowercase letter, and all
   following characters must be a dash, lowercase letter, or digit, except the last character,
   which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^AddressId this]
    (-> this (.getAddress))))

