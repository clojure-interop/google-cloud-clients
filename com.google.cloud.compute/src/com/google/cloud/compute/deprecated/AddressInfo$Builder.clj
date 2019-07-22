(ns com.google.cloud.compute.deprecated.AddressInfo$Builder
  "A builder for AddressInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated AddressInfo$Builder]))

(defn ->builder
  "Constructor."
  (^AddressInfo$Builder []
    (new AddressInfo$Builder )))

(defn set-address
  "Sets the actual IP address.

  address - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.AddressInfo$Builder`"
  (^com.google.cloud.compute.deprecated.AddressInfo$Builder [^AddressInfo$Builder this ^java.lang.String address]
    (-> this (.setAddress address))))

(defn set-description
  "Sets an optional textual description of the address.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.AddressInfo$Builder`"
  (^com.google.cloud.compute.deprecated.AddressInfo$Builder [^AddressInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-address-id
  "address-id - `com.google.cloud.compute.deprecated.AddressId`

  returns: `com.google.cloud.compute.deprecated.AddressInfo$Builder`"
  (^com.google.cloud.compute.deprecated.AddressInfo$Builder [^AddressInfo$Builder this ^com.google.cloud.compute.deprecated.AddressId address-id]
    (-> this (.setAddressId address-id))))

(defn build
  "Creates an AddressInfo object.

  returns: `com.google.cloud.compute.deprecated.AddressInfo`"
  (^com.google.cloud.compute.deprecated.AddressInfo [^AddressInfo$Builder this]
    (-> this (.build))))

