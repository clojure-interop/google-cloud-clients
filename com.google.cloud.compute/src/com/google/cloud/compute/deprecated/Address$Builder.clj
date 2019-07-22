(ns com.google.cloud.compute.deprecated.Address$Builder
  "A builder for Address objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Address$Builder]))

(defn set-address
  "Description copied from class: AddressInfo.Builder

  address - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Address$Builder`"
  (^com.google.cloud.compute.deprecated.Address$Builder [^Address$Builder this ^java.lang.String address]
    (-> this (.setAddress address))))

(defn set-description
  "Description copied from class: AddressInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Address$Builder`"
  (^com.google.cloud.compute.deprecated.Address$Builder [^Address$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-address-id
  "address-id - `com.google.cloud.compute.deprecated.AddressId`

  returns: `com.google.cloud.compute.deprecated.Address$Builder`"
  (^com.google.cloud.compute.deprecated.Address$Builder [^Address$Builder this ^com.google.cloud.compute.deprecated.AddressId address-id]
    (-> this (.setAddressId address-id))))

(defn build
  "Description copied from class: AddressInfo.Builder

  returns: `com.google.cloud.compute.deprecated.Address`"
  (^com.google.cloud.compute.deprecated.Address [^Address$Builder this]
    (-> this (.build))))

