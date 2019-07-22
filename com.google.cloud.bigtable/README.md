# Bindings for com.google.cloud.bigtable

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.bigtable "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminClient**
- class **com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder**
- class **com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings**
- class **com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient**
- class **com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder**
- class **com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings**
- class **com.google.cloud.bigtable.admin.v2.models.AppProfile$MultiClusterRoutingPolicy**
- interface **com.google.cloud.bigtable.admin.v2.models.AppProfile$RoutingPolicy**
- class **com.google.cloud.bigtable.admin.v2.models.AppProfile$SingleClusterRoutingPolicy**
- class **com.google.cloud.bigtable.admin.v2.models.AppProfile**
- enum **com.google.cloud.bigtable.admin.v2.models.Cluster$State**
- class **com.google.cloud.bigtable.admin.v2.models.Cluster**
- class **com.google.cloud.bigtable.admin.v2.models.ColumnFamily**
- class **com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest**
- class **com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest**
- class **com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest**
- class **com.google.cloud.bigtable.admin.v2.models.CreateTableRequest**
- class **com.google.cloud.bigtable.admin.v2.models.GCRules$DefaultRule**
- class **com.google.cloud.bigtable.admin.v2.models.GCRules$DurationRule**
- interface **com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule**
- class **com.google.cloud.bigtable.admin.v2.models.GCRules$IntersectionRule**
- class **com.google.cloud.bigtable.admin.v2.models.GCRules$UnionRule**
- class **com.google.cloud.bigtable.admin.v2.models.GCRules$VersionRule**
- class **com.google.cloud.bigtable.admin.v2.models.GCRules**
- enum **com.google.cloud.bigtable.admin.v2.models.Instance$State**
- enum **com.google.cloud.bigtable.admin.v2.models.Instance$Type**
- class **com.google.cloud.bigtable.admin.v2.models.Instance**
- class **com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest**
- class **com.google.cloud.bigtable.admin.v2.models.PartialListClustersException**
- class **com.google.cloud.bigtable.admin.v2.models.PartialListInstancesException**
- enum **com.google.cloud.bigtable.admin.v2.models.StorageType**
- enum **com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState**
- class **com.google.cloud.bigtable.admin.v2.models.Table**
- class **com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest**
- class **com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest**
- class **com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder**
- class **com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings**
- class **com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder**
- class **com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings**
- class **com.google.cloud.bigtable.data.v2.BigtableDataClient**
- class **com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder**
- class **com.google.cloud.bigtable.data.v2.BigtableDataSettings**
- class **com.google.cloud.bigtable.data.v2.models.BulkMutation**
- class **com.google.cloud.bigtable.data.v2.models.BulkMutationBatcher$BulkMutationFailure**
- class **com.google.cloud.bigtable.data.v2.models.BulkMutationBatcher**
- class **com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation**
- class **com.google.cloud.bigtable.data.v2.models.DefaultRowAdapter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$FamilyFilter**
- interface **com.google.cloud.bigtable.data.v2.models.Filters$Filter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$KeyFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$LimitFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$OffsetFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$QualifierFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$QualifierRangeFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$TimestampFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$TimestampRangeFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$ValueFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters$ValueRangeFilter**
- class **com.google.cloud.bigtable.data.v2.models.Filters**
- class **com.google.cloud.bigtable.data.v2.models.KeyOffset**
- class **com.google.cloud.bigtable.data.v2.models.MutateRowsException$FailedMutation**
- class **com.google.cloud.bigtable.data.v2.models.MutateRowsException**
- class **com.google.cloud.bigtable.data.v2.models.Mutation**
- interface **com.google.cloud.bigtable.data.v2.models.MutationApi**
- class **com.google.cloud.bigtable.data.v2.models.Query**
- enum **com.google.cloud.bigtable.data.v2.models.Range$BoundType**
- class **com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange**
- class **com.google.cloud.bigtable.data.v2.models.Range$TimestampRange**
- class **com.google.cloud.bigtable.data.v2.models.Range**
- class **com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow**
- class **com.google.cloud.bigtable.data.v2.models.Row**
- interface **com.google.cloud.bigtable.data.v2.models.RowAdapter$RowBuilder**
- interface **com.google.cloud.bigtable.data.v2.models.RowAdapter**
- class **com.google.cloud.bigtable.data.v2.models.RowCell**
- class **com.google.cloud.bigtable.data.v2.models.RowMutation**
- class **com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder**
- class **com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
