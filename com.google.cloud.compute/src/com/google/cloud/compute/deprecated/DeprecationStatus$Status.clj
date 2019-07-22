(ns com.google.cloud.compute.deprecated.DeprecationStatus$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DeprecationStatus$Status]))

(def DEPRECATED
  "Enum Constant.

  Operations that create a Google Compute Engine entity using a deprecated resource will return
   successfully but with a warning indicating the deprecation and suggesting a replacement.

  type: com.google.cloud.compute.deprecated.DeprecationStatus$Status"
  DeprecationStatus$Status/DEPRECATED)

(def OBSOLETE
  "Enum Constant.

  Operations that create a Google Compute Engine entity using an obsolete resource will be
   rejected and result in an error.

  type: com.google.cloud.compute.deprecated.DeprecationStatus$Status"
  DeprecationStatus$Status/OBSOLETE)

(def DELETED
  "Enum Constant.

  Operations that create a Google Compute Engine entity using a deleted resource will be
   rejected and result in an error.

  type: com.google.cloud.compute.deprecated.DeprecationStatus$Status"
  DeprecationStatus$Status/DELETED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DeprecationStatus.Status c : DeprecationStatus.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.DeprecationStatus$Status[]`"
  ([]
    (DeprecationStatus$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.DeprecationStatus$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Status [^java.lang.String name]
    (DeprecationStatus$Status/valueOf name)))

