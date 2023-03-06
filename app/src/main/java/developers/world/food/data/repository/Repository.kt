package developers.world.food.data.repository

import dagger.hilt.android.scopes.ActivityRetainedScoped
import developers.world.food.data.LocalDataSource
import developers.world.food.data.RemoteDataSource
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {
    val remote = remoteDataSource
    val local = localDataSource



}