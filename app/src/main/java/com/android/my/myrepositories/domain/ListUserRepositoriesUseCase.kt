package com.android.my.myrepositories.domain

import com.android.my.myrepositories.core.UseCase
import com.android.my.myrepositories.data.model.Repo
import com.android.my.myrepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}