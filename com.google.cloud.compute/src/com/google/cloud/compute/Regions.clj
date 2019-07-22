(ns com.google.cloud.compute.Regions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute Regions]))

(def ASIA_EAST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/ASIA_EAST1)

(def ASIA_EAST2
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/ASIA_EAST2)

(def ASIA_NORTHEAST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/ASIA_NORTHEAST1)

(def ASIA_NORTHEAST2
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/ASIA_NORTHEAST2)

(def ASIA_SOUTH1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/ASIA_SOUTH1)

(def ASIA_SOUTHEAST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/ASIA_SOUTHEAST1)

(def AUSTRALIA_SOUTHEAST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/AUSTRALIA_SOUTHEAST1)

(def EUROPE_NORTH1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/EUROPE_NORTH1)

(def EUROPE_WEST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/EUROPE_WEST1)

(def EUROPE_WEST2
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/EUROPE_WEST2)

(def EUROPE_WEST3
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/EUROPE_WEST3)

(def EUROPE_WEST4
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/EUROPE_WEST4)

(def EUROPE_WEST6
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/EUROPE_WEST6)

(def NORTHAMERICA_NORTHEAST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/NORTHAMERICA_NORTHEAST1)

(def SOUTHAMERICA_EAST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/SOUTHAMERICA_EAST1)

(def US_CENTRAL1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/US_CENTRAL1)

(def US_EAST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/US_EAST1)

(def US_EAST4
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/US_EAST4)

(def US_WEST1
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/US_WEST1)

(def US_WEST2
  "Enum Constant.

  type: com.google.cloud.compute.Regions"
  Regions/US_WEST2)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Regions c : Regions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.Regions[]`"
  ([]
    (Regions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.Regions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.Regions [^java.lang.String name]
    (Regions/valueOf name)))

(defn *from-name
  "Returns a Regions enum corresponding to the given region name.

  region-name - The name of the region. - `java.lang.String`

  returns: Regions enum representing the given region name, or a null if there is no Regions enum
       that is representing the given region name. - `com.google.cloud.compute.Regions`"
  (^com.google.cloud.compute.Regions [^java.lang.String region-name]
    (Regions/fromName region-name)))

(defn get-name
  "The name of this region.

  returns: `java.lang.String`"
  (^java.lang.String [^Regions this]
    (-> this (.getName))))

(defn get-zones
  "The zones of this region.

  returns: `java.lang.String[]`"
  ([^Regions this]
    (-> this (.getZones))))

