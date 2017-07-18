# Sample demonstrating duplicate item issue with a wrapping RecyclerView Adapter

This project contains a basic RecyclerView adapter to wrap another adapter, adding a header item.

It appears to work, until the users scrolls. At this point a duplicate item will appear followed by a runtime crash:

    java.lang.IllegalArgumentException: Pixel distance must be non-negative
      at android.support.v7.widget.GapWorker$LayoutPrefetchRegistryImpl.addPosition(GapWorker.java:110)
      at android.support.v7.widget.LinearLayoutManager.collectPrefetchPositionsForLayoutState(LinearLayoutManager

**Update/Fix:** the fix is to call `onBindViewHolder()` in the wrapping adapter (not `bindViewHolder()`). Sample project updated with fix.
