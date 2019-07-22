(ns com.google.cloud.compute.deprecated.InstanceInfo$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated InstanceInfo$Status]))

(def PROVISIONING
  "Enum Constant.

  Indicates that resources are being reserved for the instance. The instance isn't running yet.

  type: com.google.cloud.compute.deprecated.InstanceInfo$Status"
  InstanceInfo$Status/PROVISIONING)

(def STAGING
  "Enum Constant.

  Indicates that resources have been acquired and the instance is being prepared for launch.

  type: com.google.cloud.compute.deprecated.InstanceInfo$Status"
  InstanceInfo$Status/STAGING)

(def RUNNING
  "Enum Constant.

  Indicates that the instance is booting up or running. You should be able to ssh into
   the instance soon, though not immediately, after it enters this state.

  type: com.google.cloud.compute.deprecated.InstanceInfo$Status"
  InstanceInfo$Status/RUNNING)

(def STOPPING
  "Enum Constant.

  Indicates that the instance is being stopped either due to a failure, or the instance being
   shut down. This is a temporary status and the instance will move to TERMINATED.

  type: com.google.cloud.compute.deprecated.InstanceInfo$Status"
  InstanceInfo$Status/STOPPING)

(def TERMINATED
  "Enum Constant.

  Indicates that the instance was shut down or encountered a failure, either through the API or
   from inside the guest. You can choose to restart the instance or delete it.

  type: com.google.cloud.compute.deprecated.InstanceInfo$Status"
  InstanceInfo$Status/TERMINATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (InstanceInfo.Status c : InstanceInfo.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.InstanceInfo$Status[]`"
  ([]
    (InstanceInfo$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.InstanceInfo$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.InstanceInfo$Status [^java.lang.String name]
    (InstanceInfo$Status/valueOf name)))

