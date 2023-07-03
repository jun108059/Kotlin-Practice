package youngjun.me.issueservice.domain

import org.springframework.data.jpa.repository.JpaRepository
import youngjun.me.issueservice.domain.enums.IssueStatus

interface IssueRepository : JpaRepository<Issue, Long> {
    fun findAllByStatusOrderByCreatedAtDesc(status: IssueStatus): List<Issue>?
}
